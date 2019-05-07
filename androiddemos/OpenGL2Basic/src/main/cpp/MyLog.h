//
// Created by luocj on 18-6-28.
//

#ifndef ANDROIDDEBUGDEMOS_MYLOG_H
#define ANDROIDDEBUGDEMOS_MYLOG_H

#include <android/log.h>

#define MyLOGI(...)
#define MyLOGD(...) ((void)__android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__))
#define MyLOGW(...) ((void)__android_log_print(ANDROID_LOG_WARN, LOG_TAG, __VA_ARGS__))
#define MyLOGE(...) ((void)__android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__))

#endif //ANDROIDDEBUGDEMOS_MYLOG_H
