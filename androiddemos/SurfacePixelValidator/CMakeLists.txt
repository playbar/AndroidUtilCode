cmake_minimum_required(VERSION 3.4.1)

#set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11  -Werror -D VK_USE_PLATFORM_ANDROID_KHR")

#set(CMAKE_SHARED_LINKER_FLAGS "${CMAKE_SHARED_LINKER_FLAGS} -u ANativeActivity_onCreate")

set(RENDER_SCRIPT_HEADERS_PATH ${ANDROID_NDK}/toolchains/renderscript/prebuilt/${ANDROID_HOST_TAG}/platform/rs)

INCLUDE_DIRECTORIES(
     ${RENDER_SCRIPT_HEADERS_PATH}/cpp
     ${RENDER_SCRIPT_HEADERS_PATH}/scriptc
     ${RENDER_SCRIPT_HEADERS_PATH}
     build/generated/source/rs/debug )

link_directories( ${ANDROID_NDK}/toolchains/renderscript/prebuilt/${ANDROID_HOST_TAG}/platform/${ANDROID_SYSROOT_ABI})


add_library( native_pixelvalidator
             SHARED
             src/main/cpp/SurfacePixelValidator.cpp
             src/main/rs/PixelCounter.rs
             src/main/rs/mono.rs )

target_link_libraries( native_pixelvalidator
                       RScpp_static
                       log )
