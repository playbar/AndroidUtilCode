cmake_minimum_required(VERSION 3.4.1)

add_library(native_activity_glue STATIC
            ${ANDROID_NDK}/sources/android/native_app_glue/android_native_app_glue.c )

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11  -Werror -D VK_USE_PLATFORM_ANDROID_KHR")

set(CMAKE_SHARED_LINKER_FLAGS "${CMAKE_SHARED_LINKER_FLAGS} -u ANativeActivity_onCreate")

add_library( zlib
             STATIC
             zlib/zlib-1.2.11/adler32.c
             zlib/zlib-1.2.11/compress.c
             zlib/zlib-1.2.11/crc32.c
             zlib/zlib-1.2.11/deflate.c
             zlib/zlib-1.2.11/gzclose.c
             zlib/zlib-1.2.11/gzlib.c
             zlib/zlib-1.2.11/gzread.c
             zlib/zlib-1.2.11/gzwrite.c
             zlib/zlib-1.2.11/infback.c
             zlib/zlib-1.2.11/inflate.c
             zlib/zlib-1.2.11/inftrees.c
             zlib/zlib-1.2.11/inffast.c
             zlib/zlib-1.2.11/trees.c
             zlib/zlib-1.2.11/uncompr.c
             zlib/zlib-1.2.11/zutil.c )

target_include_directories(zlib PRIVATE
            zlib/zlib-1.2.11 )

add_library( png
             STATIC
             png/libpng-1.6.34/png.c
             png/libpng-1.6.34/pngerror.c
             png/libpng-1.6.34/pngget.c
             png/libpng-1.6.34/pngmem.c
             png/libpng-1.6.34/pngpread.c
             png/libpng-1.6.34/pngread.c
             png/libpng-1.6.34/pngrio.c
             png/libpng-1.6.34/pngrtran.c
             png/libpng-1.6.34/pngrutil.c
             png/libpng-1.6.34/pngset.c
             png/libpng-1.6.34/pngtrans.c
             png/libpng-1.6.34/pngwio.c
             png/libpng-1.6.34/pngwrite.c
             png/libpng-1.6.34/pngwtran.c
             png/libpng-1.6.34/pngwutil.c )

target_include_directories(png PRIVATE
            png/libpng-1.6.34
            zlib/zlib-1.2.11 )

target_link_libraries( png
                       zlib )

add_library( png_codec
             SHARED
             src/main/cpp/PngCodecNativeActivity.cpp
             src/main/cpp/PngTest.cpp
             src/main/cpp/utils.cpp )

target_include_directories( png_codec PRIVATE
             ${ANDROID_NDK}/sources/android/native_app_glue
             png/libpng-1.6.34
             zlib/zlib-1.2.11 )

target_link_libraries( png_codec
                       native_activity_glue
                       android
                       zlib
                       png
                       log )
