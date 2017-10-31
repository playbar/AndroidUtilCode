#include <string.h>
#include <jni.h>
#include "first.h"

extern "C" {
JNIEXPORT jstring JNICALL Java_com_boost_test_HelloBoost_stringFromJNI(
	JNIEnv* env, jobject thiz );
}

JNIEXPORT jstring JNICALL
Java_com_boost_test_HelloBoost_stringFromJNI( JNIEnv* env,
                                                  jobject thiz )
{
	const char *args[]={"jni","--change-world","hello","world"};
	std::string result = hello_boost(4,(char **)args);
	const char *c_result = result.c_str();
	return env->NewStringUTF(c_result);
}
