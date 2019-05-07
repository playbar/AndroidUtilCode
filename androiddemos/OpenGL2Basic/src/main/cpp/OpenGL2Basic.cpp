#undef LOG_TAG
#define LOG_TAG "OpenGL2Basic"

#include <android/sensor.h>
#include <android_native_app_glue.h>

#include <cassert>
#include <cstdlib>
#include <cstring>
#include <errno.h>

#include <initializer_list>

#include <EGL/egl.h>
#include <GLES/gl.h>

#include "MyLog.h"
#include "demo.h"

int gAppAlive = 1;

/**
 * Our saved state data.
 */
struct saved_state {
    float angle;
    int32_t x;
    int32_t y;
};

/**
 * Shared state for our app.
 */
struct engine {
    struct android_app *app;

    ASensorManager *sensorManager;
    const ASensor *accelerometerSensor;
    ASensorEventQueue *sensorEventQueue;

    EGLint samples;

    int animating;
    EGLDisplay display;
    EGLSurface surface;
    EGLContext context;
    int32_t width;
    int32_t height;
    struct saved_state state;
};

static void checkGLErrors()
{
    GLenum error = glGetError();
    if (error != GL_NO_ERROR)
        fprintf(stderr, "GL Error: 0x%04x\n", (int)error);
}

static void checkEGLErrors()
{
    EGLint error = eglGetError();
    // GLESonGL seems to be returning 0 when there is no errors?
    if (error && error != EGL_SUCCESS)
        fprintf(stderr, "EGL Error: 0x%04x\n", (int)error);
}

/**
 * Initialize an EGL context for the current display.
 */
static int engine_init_display(struct engine *engine) {
    // initialize OpenGL ES and EGL

    /*
     * Here specify the attributes of the desired configuration.
     * Below, we select an EGLConfig with at least 8 bits per color
     * component compatible with on-screen windows
     */
    const EGLint configAttribs[] = {
            EGL_DEPTH_SIZE, 16,
            EGL_SAMPLE_BUFFERS, engine->samples ? 1 : 0,
            EGL_SAMPLES, engine->samples,
            EGL_NONE
    };


    EGLint majorVersion;
    EGLint minorVersion;
    EGLContext context;
    EGLConfig config;
    EGLSurface surface;
    EGLint w, h, format = WINDOW_FORMAT_RGBA_8888;
    EGLDisplay dpy;

    dpy = eglGetDisplay(EGL_DEFAULT_DISPLAY);
    eglInitialize(dpy, &majorVersion, &minorVersion);

    EGLint numConfigs = -1, n = 0;

    // Get all the "potential match" configs...
    if (eglGetConfigs(dpy, NULL, 0, &numConfigs) == EGL_FALSE) {
        MyLOGW("Unable to eglMakeCurrent");
        return -1;
    }

    EGLConfig *const configs = new EGLConfig[numConfigs];
    if (eglChooseConfig(dpy, configAttribs, configs, numConfigs, &n) == EGL_FALSE) {
        return -1;
    }

    int i;
    for (i = 0; i < n; i++) {
        EGLint nativeVisualId = 0;
        eglGetConfigAttrib(dpy, configs[i], EGL_NATIVE_VISUAL_ID, &nativeVisualId);
        if (nativeVisualId > 0 && format == nativeVisualId) {
            config = configs[i];
            break;
        }
    }

    if (i == n) {
        config = configs[0];
    }

    surface = eglCreateWindowSurface(dpy, config, engine->app->window, NULL);
    context = eglCreateContext(dpy, config, NULL, NULL);

    if (eglMakeCurrent(dpy, surface, surface, context) == EGL_FALSE) {
        MyLOGW("Unable to eglMakeCurrent");
        return -1;
    }

    eglQuerySurface(dpy, surface, EGL_WIDTH, &w);
    eglQuerySurface(dpy, surface, EGL_HEIGHT, &h);

    engine->display = dpy;
    engine->context = context;
    engine->surface = surface;
    engine->width = w;
    engine->height = h;
    engine->state.angle = 0;

    // Check openGL on the system
    auto opengl_info = {GL_VENDOR, GL_RENDERER, GL_VERSION, GL_EXTENSIONS};
    for (auto name : opengl_info) {
        auto info = glGetString(name);
        MyLOGI("OpenGL Info: %s", info);
    }

    if (engine->samples == 0) {
        // GL_MULTISAMPLE is enabled by default
        glDisable(GL_MULTISAMPLE);
    }
    return 0;
}

/**
 * Just the current frame in the display.
 */
static void engine_draw_frame(struct engine *engine) {
    if (engine->display == NULL) {
        // No display.
        return;
    }

    // Just fill the screen with a color.
    glClearColor(((float) engine->state.x) / engine->width, engine->state.angle,
                 ((float) engine->state.y) / engine->height, 1);
    glClear(GL_COLOR_BUFFER_BIT);

    eglSwapBuffers(engine->display, engine->surface);
}

/**
 * Tear down the EGL context currently associated with the display.
 */
static void engine_term_display(struct engine *engine) {
    if (engine->display != EGL_NO_DISPLAY) {
        eglMakeCurrent(engine->display, EGL_NO_SURFACE, EGL_NO_SURFACE, EGL_NO_CONTEXT);
        if (engine->context != EGL_NO_CONTEXT) {
            eglDestroyContext(engine->display, engine->context);
        }
        if (engine->surface != EGL_NO_SURFACE) {
            eglDestroySurface(engine->display, engine->surface);
        }
        eglTerminate(engine->display);
    }
    engine->animating = 0;
    engine->display = EGL_NO_DISPLAY;
    engine->context = EGL_NO_CONTEXT;
    engine->surface = EGL_NO_SURFACE;
}

/**
 * Process the next input event.
 */
static int32_t engine_handle_input(struct android_app *app, AInputEvent *event) {
    struct engine *engine = (struct engine *) app->userData;
    if (AInputEvent_getType(event) == AINPUT_EVENT_TYPE_MOTION) {
        MyLOGI("engine_handle_input-%d-AINPUT_EVENT_TYPE_MOTION", AINPUT_EVENT_TYPE_MOTION);
        engine->animating = !engine->animating;
        engine->state.x = AMotionEvent_getX(event, 0);
        engine->state.y = AMotionEvent_getY(event, 0);
        return 1;
    }
    MyLOGI("engine_handle_input-%d", AInputEvent_getType(event));
    return 0;
}

/**
 * Process the next main command.
 */
static void engine_handle_cmd(struct android_app *app, int32_t cmd) {
    struct engine *engine = (struct engine *) app->userData;
    switch (cmd) {
        case APP_CMD_SAVE_STATE:
            MyLOGI("processCommand-%d-APP_CMD_SAVE_STATE", APP_CMD_SAVE_STATE);
            // The system has asked us to save our current state.  Do so.
            engine->app->savedState = malloc(sizeof(struct saved_state));
            *((struct saved_state *) engine->app->savedState) = engine->state;
            engine->app->savedStateSize = sizeof(struct saved_state);
            break;
        case APP_CMD_INIT_WINDOW:
            MyLOGI("processCommand-%d-APP_CMD_INIT_WINDOW", APP_CMD_INIT_WINDOW);
            // The window is being shown, get it ready.
            if (engine->app->window != NULL) {
                engine_init_display(engine);
                appInit();
                engine_draw_frame(engine);
            }
            break;
        case APP_CMD_TERM_WINDOW:
            MyLOGI("processCommand-%d-APP_CMD_TERM_WINDOW", APP_CMD_TERM_WINDOW);
            // The window is being hidden or closed, clean it up.
            engine_term_display(engine);
            break;
        case APP_CMD_GAINED_FOCUS:
            MyLOGI("processCommand-%d-APP_CMD_GAINED_FOCUS", APP_CMD_GAINED_FOCUS);
            // When our app gains focus, we start monitoring the accelerometer.
            if (engine->accelerometerSensor != NULL) {
                ASensorEventQueue_enableSensor(engine->sensorEventQueue,
                                               engine->accelerometerSensor);
                // We'd like to get 60 events per second (in us).
                ASensorEventQueue_setEventRate(engine->sensorEventQueue,
                                               engine->accelerometerSensor,
                                               (1000L / 60) * 1000);
            }
            break;
        case APP_CMD_LOST_FOCUS:
            MyLOGI("processCommand-%d-APP_CMD_LOST_FOCUS", APP_CMD_LOST_FOCUS);
            // When our app loses focus, we stop monitoring the accelerometer.
            // This is to avoid consuming battery while not being used.
            if (engine->accelerometerSensor != NULL) {
                ASensorEventQueue_disableSensor(engine->sensorEventQueue,
                                                engine->accelerometerSensor);
            }
            // Also stop animating.
            engine->animating = 0;
            engine_draw_frame(engine);
            break;

        case APP_CMD_INPUT_CHANGED:
            MyLOGI("processCommand-%d-APP_CMD_INPUT_CHANGED", cmd);
            break;

        case APP_CMD_WINDOW_RESIZED:
            MyLOGI("processCommand-%d-APP_CMD_WINDOW_RESIZED", cmd);
            break;

        case APP_CMD_WINDOW_REDRAW_NEEDED:
            MyLOGI("processCommand-%d-APP_CMD_WINDOW_REDRAW_NEEDED", cmd);
            break;

        case APP_CMD_CONTENT_RECT_CHANGED:
            MyLOGI("processCommand-%d-APP_CMD_CONTENT_RECT_CHANGED", cmd);
            break;

        case APP_CMD_CONFIG_CHANGED:
            MyLOGI("processCommand-%d-APP_CMD_CONFIG_CHANGED", cmd);
            break;

        case APP_CMD_LOW_MEMORY:
            MyLOGI("processCommand-%d-APP_CMD_LOW_MEMORY", cmd);
            break;

        case APP_CMD_START:
            MyLOGI("processCommand-%d-APP_CMD_START", cmd);
            break;

        case APP_CMD_RESUME:
            MyLOGI("processCommand-%d-APP_CMD_RESUME", cmd);
            break;

        case APP_CMD_PAUSE:
            MyLOGI("processCommand-%d-APP_CMD_PAUSE", cmd);
            break;

        case APP_CMD_STOP:
            MyLOGI("processCommand-%d-APP_CMD_STOP", cmd);
            break;

        case APP_CMD_DESTROY:
            MyLOGI("processCommand-%d-APP_CMD_DESTROY", cmd);
            break;

        default:
            MyLOGI("processCommand-%d-default", cmd);
    }
}

/*
 * AcquireASensorManagerInstance(void)
 *    Workaround ASensorManager_getInstance() deprecation false alarm
 *    for Android-N and before, when compiling with NDK-r15
 */
#include <dlfcn.h>

ASensorManager *AcquireASensorManagerInstance(android_app *app) {

    if (!app)
        return nullptr;

    typedef ASensorManager *(*PF_GETINSTANCEFORPACKAGE)(const char *name);
    void *androidHandle = dlopen("libandroid.so", RTLD_NOW);
    PF_GETINSTANCEFORPACKAGE getInstanceForPackageFunc = (PF_GETINSTANCEFORPACKAGE)
            dlsym(androidHandle, "ASensorManager_getInstanceForPackage");
    if (getInstanceForPackageFunc) {
        JNIEnv *env = nullptr;
        app->activity->vm->AttachCurrentThread(&env, NULL);

        jclass android_content_Context = env->GetObjectClass(app->activity->clazz);
        jmethodID midGetPackageName = env->GetMethodID(android_content_Context,
                                                       "getPackageName",
                                                       "()Ljava/lang/String;");
        jstring packageName = (jstring) env->CallObjectMethod(app->activity->clazz,
                                                              midGetPackageName);

        const char *nativePackageName = env->GetStringUTFChars(packageName, 0);
        ASensorManager *mgr = getInstanceForPackageFunc(nativePackageName);
        env->ReleaseStringUTFChars(packageName, nativePackageName);
        app->activity->vm->DetachCurrentThread();
        if (mgr) {
            dlclose(androidHandle);
            return mgr;
        }
    }

    typedef ASensorManager *(*PF_GETINSTANCE)();
    PF_GETINSTANCE getInstanceFunc = (PF_GETINSTANCE)
            dlsym(androidHandle, "ASensorManager_getInstance");
    // by all means at this point, ASensorManager_getInstance should be available
    assert(getInstanceFunc);
    dlclose(androidHandle);

    return getInstanceFunc();
}


/**
 * This is the main entry point of a native application that is using
 * android_native_app_glue.  It runs in its own thread, with its own
 * event loop for receiving input events and doing other things.
 */
void android_main(struct android_app *state) {
    MyLOGD("android_main start");
    struct engine engine;

    memset(&engine, 0, sizeof(engine));
    state->userData = &engine;
    state->onAppCmd = engine_handle_cmd;
    state->onInputEvent = engine_handle_input;
    engine.app = state;

    // Prepare to monitor accelerometer
    engine.sensorManager = AcquireASensorManagerInstance(state);
    engine.accelerometerSensor = ASensorManager_getDefaultSensor(
            engine.sensorManager,
            ASENSOR_TYPE_ACCELEROMETER);
    engine.sensorEventQueue = ASensorManager_createEventQueue(
            engine.sensorManager,
            state->looper, LOOPER_ID_USER,
            NULL, NULL);

    if (state->savedState != NULL) {
        // We are starting with a previous saved state; restore from it.
        engine.state = *(struct saved_state *) state->savedState;
    }

    struct timeval timeTemp;
    int frameCount = 0;
    gettimeofday(&timeTemp, NULL);
    double totalTime = timeTemp.tv_usec/1000000.0 + timeTemp.tv_sec;

    // loop waiting for stuff to do.
    while (gAppAlive) {
        // Read all pending events.
        int ident;
        int events;
        struct android_poll_source *source;
        MyLOGI("android_main while 1");

        // If not animating, we will block forever waiting for events.
        // If animating, we loop until all events are read, then continue
        // to draw the next frame of animation.
        while ((ident = ALooper_pollAll(engine.animating ? 0 : -1, NULL, &events,
                                        (void **) &source)) >= 0) {
            MyLOGI("android_main while ALooper_pollAll");
            // Process this event.
            if (source != NULL) {
                MyLOGI("android_main while source->process");
                source->process(state, source);
            }

            // If a sensor has data, process it now.
            if (ident == LOOPER_ID_USER) {
                MyLOGI("android_main while LOOPER_ID_USER");
                if (engine.accelerometerSensor != NULL) {
                    ASensorEvent event;
                    while (ASensorEventQueue_getEvents(engine.sensorEventQueue,
                                                       &event, 1) > 0) {
                        MyLOGI("android_main accelerometer: x=%f y=%f z=%f",
                               event.acceleration.x, event.acceleration.y,
                               event.acceleration.z);
                    }
                }
            }

            // Check if we are exiting.
            if (state->destroyRequested != 0) {
                MyLOGD("android_main while engine_term_display");
                gAppAlive = 0;
                break;
            }
        }

        if (engine.animating) {
            MyLOGD("android_main while engine.animating");

            struct timeval timeNow;

            gettimeofday(&timeNow, NULL);
            appRender(timeNow.tv_sec * 1000 + timeNow.tv_usec / 1000,
                      engine.width, engine.height);
            checkGLErrors();
            eglSwapBuffers(engine.display, engine.surface);
            checkEGLErrors();
            frameCount++;
        }
    }

    gettimeofday(&timeTemp, NULL);

    appDeinit();
    engine_term_display(&engine);

    totalTime = (timeTemp.tv_usec/1000000.0 + timeTemp.tv_sec) - totalTime;
    MyLOGD("totalTime=%f s, frameCount=%d, %.2f fps\n",
           totalTime, frameCount, frameCount/totalTime);

    MyLOGD("android_main end");
}