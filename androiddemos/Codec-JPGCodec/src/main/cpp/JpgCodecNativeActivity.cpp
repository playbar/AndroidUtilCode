#include <android_native_app_glue.h>

#include <malloc.h>

#include "JpegTest.h"

static int32_t engine_handle_input(struct android_app* app, AInputEvent* event) {
    struct engine* engine = (struct engine*)app->userData;
    if (AInputEvent_getType(event) == AINPUT_EVENT_TYPE_MOTION) {
        engine->animating = 1;
        return 1;
    } else if (AInputEvent_getType(event) == AINPUT_EVENT_TYPE_KEY) {
        ALOGI("Key event: action=%d keyCode=%d metaState=0x%x",
             AKeyEvent_getAction(event),
             AKeyEvent_getKeyCode(event),
             AKeyEvent_getMetaState(event));
    }

    return 0;
}

static void engine_handle_cmd(struct android_app* app, int32_t cmd) {
    static int32_t format = WINDOW_FORMAT_RGB_565;
    struct engine* engine = (struct engine*)app->userData;
    switch (cmd) {
        case APP_CMD_INIT_WINDOW:
            break;
        case APP_CMD_TERM_WINDOW:
            break;
        case APP_CMD_LOST_FOCUS:
            engine->animating = 0;
            break;
    }
}

void android_main(android_app *app) {
    ALOGE("android_main start");

    struct engine engine;

    memset(&engine, 0, sizeof(engine));

    app->userData = &engine;
    app->onAppCmd = engine_handle_cmd;
    app->onInputEvent = engine_handle_input;

    char fileName[512] = {0};
    sprintf(fileName, "/data/medias/jpg/%s", "jpg_4_2_32bit.jpg");
    readJpegFile(fileName);

    while (1) {
        // Read all pending events.
        int ident;
        int events;
        struct android_poll_source* source;

        // If not animating, we will block forever waiting for events.
        // If animating, we loop until all events are read, then continue
        // to draw the next frame of animation.
        while ((ident=ALooper_pollAll(engine.animating ? 0 : -1, NULL, &events,
                                      (void**)&source)) >= 0) {

            // Process this event.
            if (source != NULL) {
                source->process(app, source);
            }

            // Check if we are exiting.
            if (app->destroyRequested != 0) {
                ALOGI("Engine thread destroy requested!");
                return;
            }
        }

        if (engine.animating) {
        }
    }

    return;
}