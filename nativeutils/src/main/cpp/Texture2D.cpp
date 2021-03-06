
#include <stdlib.h>
#include <pthread.h>
#include <stdio.h>
#include <unistd.h>
#include "esUtil.h"
#include "Texture2D.h"
#include "logging.h"

pthread_t newTid;


int inOrNot(int poly_sides, float *poly_X, float *poly_Y, float x, float y)
{
    int i, j;
    j = poly_sides-1;
    int res = 0;
    for (i = 0; i<poly_sides; i++)
    {
        if(( poly_Y[i] >= y != poly_Y[j] >= y) )
        {
            float fx = (poly_X[i] + (y-poly_Y[i])/(poly_Y[j]-poly_Y[i])*(poly_X[j]-poly_X[i]));
            res ^= ( fx > x);
        }
        j=i;
    }
    return res;
}

int testInOrNot()
{
    int poly_sides = 5;                 // 多边形顶点数
    float poly_X[5] = {1, 1, 3, 4, 3};  // 多边形各顶点的X轴坐标
    float poly_Y[5] = {1, 2, 3, 2, 1};  // 多边形各顶点的Y轴坐标
    float x = 2;                      // 测试点的X轴坐标
    float y = 2;                        // 测试点的Y轴坐标

    int ret;
    ret = inOrNot(poly_sides, poly_X, poly_Y, x, y);

    if(1 == ret)
    {
        LOGE("the point (%f, %f), in the poly\n", x, y);
    }
    else
    {
        LOGE("the point (%f, %f), not in the poly\n", x, y);
    }

    return 0;
}

void *ThreadRunnable(void *arg) {
   LOG(WARNING) << "Run in another thread";
   return ((void *)0);
}

void TestStopWatch() {
   int *ptr = new int[10];
   CHECK_NOTNULL(ptr);
   DLOG(INFO) << "of [" << __func__ << "]";
    delete []ptr;
}

int logtest() {
   LOG(INFO) << "Dump log test";

   // CHECK Operation
   CHECK_NE(1, 2) << ": The world must be ending!";
   // Check if it is euqual
   CHECK_EQ(std::string("abc")[1], 'b');

   int x = 2;
   int y = 1;
   LOG_IF(ERROR, x > y) << "2 > 1. This should be also OK";

   // Test dump log in different thread
   int err = pthread_create(&newTid, NULL, ThreadRunnable, NULL);
   if (err != 0) {
      LOG(FATAL) << "Unable to create a thread";
      return 1;
   }
   sleep(1);
   TestStopWatch();
   return 0;
}

typedef struct
{
   // Handle to a program object
   GLuint programObject;

   // Sampler location
   GLint samplerLoc;

   // Texture handle
   GLuint textureId;

} UserData;

///
// Create a simple 2x2 texture image with four different colors
//
GLuint CreateSimpleTexture2D( )
{
   // Texture object handle
   GLuint textureId =0;

   // 2x2 Image, 3 bytes per pixel (R, G, B)
   GLubyte pixels[4 * 3] =
   {
      255,   0,   0, // Red
        0, 255,   0, // Green
        0,   0, 255, // Blue
      255, 255,   0  // Yellow
   };

   // Use tightly packed data
   glPixelStorei ( GL_UNPACK_ALIGNMENT, 1 );

   // Generate a texture object
   glGenTextures ( 1, &textureId );

   // Bind the texture object
   glBindTexture ( GL_TEXTURE_2D, textureId );

   // Load the texture
   glTexImage2D ( GL_TEXTURE_2D, 0, GL_RGB, 2, 2, 0, GL_RGB, GL_UNSIGNED_BYTE, pixels );

   // Set the filtering mode
   glTexParameteri ( GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST );
   glTexParameteri ( GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST );

   return textureId;

}

class Base {};
class Derived: public Base {};

///
// Initialize the shader and program object
//
int Init ( ESContext *esContext )
{
    testInOrNot();
    logtest();
   UserData *userData = (UserData *)esContext->userData;
   char vShaderStr[] =
      "#version 300 es                            \n"
      "layout(location = 0) in vec4 a_position;   \n"
      "layout(location = 1) in vec2 a_texCoord;   \n"
      "out vec2 v_texCoord;                       \n"
      "void main()                                \n"
      "{                                          \n"
      "   gl_Position = a_position;               \n"
      "   v_texCoord = a_texCoord;                \n"
      "}                                          \n";

   char fShaderStr[] =
      "#version 300 es                                     \n"
      "precision mediump float;                            \n"
      "in vec2 v_texCoord;                                 \n"
      "layout(location = 0) out vec4 outColor;             \n"
      "uniform sampler2D s_texture;                        \n"
      "void main()                                         \n"
      "{                                                   \n"
      "  outColor = texture( s_texture, v_texCoord );      \n"
      "}                                                   \n";

   // Load the shaders and get a linked program object
   userData->programObject = esLoadProgram ( vShaderStr, fShaderStr );

   // Get the sampler location
   userData->samplerLoc = glGetUniformLocation ( userData->programObject, "s_texture" );

   // Load the texture
   userData->textureId = CreateSimpleTexture2D ();

   glClearColor ( 1.0f, 1.0f, 1.0f, 0.0f );
   return TRUE;
}

///
// Draw a triangle using the shader pair created in Init()
//
void Draw ( ESContext *esContext )
{
   UserData *userData = (UserData *)esContext->userData;
   GLfloat vVertices[] = { -0.5f,  0.5f, 0.0f,  // Position 0
                            0.0f,  0.0f,        // TexCoord 0 
                           -0.5f, -0.5f, 0.0f,  // Position 1
                            0.0f,  1.0f,        // TexCoord 1
                            0.5f, -0.5f, 0.0f,  // Position 2
                            1.0f,  1.0f,        // TexCoord 2
                            0.5f,  0.5f, 0.0f,  // Position 3
                            1.0f,  0.0f         // TexCoord 3
                         };
   GLushort indices[] = { 0, 1, 2, 0, 2, 3 };

   // Set the viewport
   glViewport ( 0, 0, esContext->width, esContext->height );

   // Clear the color buffer
   glClear ( GL_COLOR_BUFFER_BIT );

   // Use the program object
   glUseProgram ( userData->programObject );

   // Load the vertex position
   glVertexAttribPointer ( 0, 3, GL_FLOAT, GL_FALSE, 5 * sizeof ( GLfloat ), vVertices );
   // Load the texture coordinate
   glVertexAttribPointer ( 1, 2, GL_FLOAT, GL_FALSE, 5 * sizeof ( GLfloat ), &vVertices[3] );

   glEnableVertexAttribArray ( 0 );
   glEnableVertexAttribArray ( 1 );

   // Bind the texture
   glActiveTexture ( GL_TEXTURE0 );
   glBindTexture ( GL_TEXTURE_2D, userData->textureId );

   // Set the sampler texture unit to 0
   glUniform1i ( userData->samplerLoc, 0 );

//   LOGI("draw---->");
   glDrawElements ( GL_TRIANGLES, 6, GL_UNSIGNED_SHORT, indices );

   pthread_t seft = pthread_self();
   LOGE( "draw thread id=%u", seft  );

}

///
// Cleanup
//
void ShutDown ( ESContext *esContext )
{
   UserData *userData = (UserData *)esContext->userData;

   // Delete texture object
   glDeleteTextures ( 1, &userData->textureId );

   // Delete program object
   glDeleteProgram ( userData->programObject );
}

EGLContext gShareContext;

void *thread_1(void *pdata){
   sleep( 2);
   ESContext *esContext = (ESContext*)pdata;
   if( !eglMakeCurrent( esContext->eglDisplay, NULL, NULL, gShareContext )){
      printf("error");
   }
   UserData *userData = (UserData *)esContext->userData;
   userData->textureId = CreateSimpleTexture2D ();
//   GLuint texid;
//   glGenTextures(2, &texid );
//   printf("texid=%d", texid );
   pthread_t seft = pthread_self();
   LOGE( "sub thread id=%u", seft  );
   pthread_exit(0);
   return NULL;

}

void createSharedContext(ESContext *esContext){
   EGLint contextAttribs[] = { EGL_CONTEXT_CLIENT_VERSION, 3, EGL_NONE };
   EGLint numConfigs = 0;
   EGLConfig config;
   int flags = 0;
   EGLint attribList[] =
  {
       EGL_RED_SIZE,       5,
       EGL_GREEN_SIZE,     6,
       EGL_BLUE_SIZE,      5,
       EGL_ALPHA_SIZE,     ( flags & ES_WINDOW_ALPHA ) ? 8 : EGL_DONT_CARE,
       EGL_DEPTH_SIZE,     ( flags & ES_WINDOW_DEPTH ) ? 8 : EGL_DONT_CARE,
       EGL_STENCIL_SIZE,   ( flags & ES_WINDOW_STENCIL ) ? 8 : EGL_DONT_CARE,
       EGL_SAMPLE_BUFFERS, ( flags & ES_WINDOW_MULTISAMPLE ) ? 1 : 0,
       // if EGL_KHR_create_context extension is supported, then we will use
       // EGL_OPENGL_ES3_BIT_KHR instead of EGL_OPENGL_ES2_BIT in the attribute list
       EGL_RENDERABLE_TYPE, EGL_OPENGL_ES2_BIT,
       EGL_NONE
  };

   // Choose config
   if ( !eglChooseConfig ( esContext->eglDisplay, attribList, &config, 1, &numConfigs ) )
   {
      return;
   }

   gShareContext = eglCreateContext( esContext->eglDisplay, config, esContext->eglContext, contextAttribs );

}

int esMain ( ESContext *esContext )
{
   esContext->userData = malloc ( sizeof ( UserData ) );

   esCreateWindow ( esContext, "Simple Texture 2D", 320, 240, ES_WINDOW_RGB );

   if ( !Init ( esContext ) )
   {
      return GL_FALSE;
   }

//   eglMakeCurrent( esContext->eglDisplay, esContext->eglSurface, esContext->eglSurface, gShareContext );

   esRegisterDrawFunc ( esContext, Draw );
   esRegisterShutdownFunc ( esContext, ShutDown );

   createSharedContext( esContext );

//   pthread_t id_1;
//   int ret;
//   ret = pthread_create( &id_1, NULL, thread_1, esContext );
//   if( ret != 0 ){
//      printf("Create thread error\n");
//   }
//   pthread_join( id_1, NULL );

   pthread_t seft = pthread_self();
   LOGE( "main thread id=%u", seft );

   return GL_TRUE;
}
