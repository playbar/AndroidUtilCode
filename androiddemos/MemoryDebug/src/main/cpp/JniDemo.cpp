#include <jni.h>
#include <string>
#include <malloc.h>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_luocj_android_memorydebug_MyJNI_sayHello(
        JNIEnv *env,
        jobject /* this */) {
    char* buffer;
    char* buffer2;
    size_t i;
    buffer = (char*) malloc(1024);
    buffer2 = (char*) malloc(1024);
    for (i = 0; i < 1050; i++)
    {
        buffer[i] = 'a';
    }

    for (i = 0; i < 1050; i++)
    {
        buffer2[i] = 'b';
    }
    free(buffer);
    buffer[0] = 'c';
    buffer2[0] = 'd';
    return env->NewStringUTF("Hello from JNI C++ NDK not free");
}
