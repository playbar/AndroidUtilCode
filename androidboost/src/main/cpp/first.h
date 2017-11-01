#ifndef __FIRST_H__
#define __FIRST_H__

#include <string>
#include <jni.h>

#ifdef __cplusplus
extern "C" {
#endif

std::string hello_boost(int ac, char *av[]);

JNIEXPORT jstring JNICALL Java_com_boost_test_HelloBoost_stringFromJNI(JNIEnv* env, jobject thiz );

JNIEXPORT void JNICALL Java_com_boost_test_HelloBoost_testBoostArray(JNIEnv* env, jobject thiz );

#ifdef __cplusplus
}
#endif

#endif


