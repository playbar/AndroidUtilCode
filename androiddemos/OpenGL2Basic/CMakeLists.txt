cmake_minimum_required(VERSION 3.4.1)

set(${CMAKE_C_FLAGS}, "${CMAKE_C_FLAGS}")
add_library(native_activity_glue STATIC
            ${ANDROID_NDK}/sources/android/native_app_glue/android_native_app_glue.c )

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11  -Werror -D VK_USE_PLATFORM_ANDROID_KHR")

set(CMAKE_SHARED_LINKER_FLAGS "${CMAKE_SHARED_LINKER_FLAGS} -u ANativeActivity_onCreate")

add_library( native_gl2_basic
             SHARED
             src/main/cpp/MyLog.cpp
             src/main/cpp/OpenGL2Basic.cpp
             src/main/cpp/demo.c
              )

target_include_directories(native_gl2_basic PRIVATE
            ${ANDROID_NDK}/sources/android/native_app_glue )

target_link_libraries( native_gl2_basic
                       native_activity_glue
                       android
                       EGL
                       GLESv1_CM
                       log )
