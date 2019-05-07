cmake_minimum_required(VERSION 3.4.1)

add_library(native_activity_glue STATIC
            ${ANDROID_NDK}/sources/android/native_app_glue/android_native_app_glue.c )

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11  -Werror -D VK_USE_PLATFORM_ANDROID_KHR")

set(CMAKE_SHARED_LINKER_FLAGS "${CMAKE_SHARED_LINKER_FLAGS} -u ANativeActivity_onCreate")

if(${ANDROID_ABI} STREQUAL "arm")
    MESSAGE(STATUS "JPEG: arm")
    set(JPEG_SOURCES
            jpeg/libjpeg-turbo/simd/jsimd_arm_neon.S
            jpeg/libjpeg-turbo/simd/jsimd_arm.c )
elseif(${ANDROID_ABI} STREQUAL "arm64")
    MESSAGE(STATUS "JPEG: arm64")
    set(JPEG_SOURCES
            jpeg/libjpeg-turbo/simd/jsimd_arm64_neon.S
            jpeg/libjpeg-turbo/simd/jsimd_arm64.c )
elseif(${ANDROID_ABI} STREQUAL "x86")
    MESSAGE(STATUS "JPEG: x86")
    set(JPEG_SOURCES
            jpeg/libjpeg-turbo/simd/jsimd_i386.c
            jpeg/libjpeg-turbo/simd/jccolor-mmx.asm
            jpeg/libjpeg-turbo/simd/jccolor-sse2.asm
            jpeg/libjpeg-turbo/simd/jcgray-mmx.asm
            jpeg/libjpeg-turbo/simd/jcgray-sse2.asm
            jpeg/libjpeg-turbo/simd/jchuff-sse2.asm
            jpeg/libjpeg-turbo/simd/jcsample-mmx.asm
            jpeg/libjpeg-turbo/simd/jcsample-sse2.asm
            jpeg/libjpeg-turbo/simd/jdcolor-mmx.asm
            jpeg/libjpeg-turbo/simd/jdcolor-sse2.asm
            jpeg/libjpeg-turbo/simd/jdmerge-mmx.asm
            jpeg/libjpeg-turbo/simd/jdmerge-sse2.asm
            jpeg/libjpeg-turbo/simd/jdsample-mmx.asm
            jpeg/libjpeg-turbo/simd/jdsample-sse2.asm
            jpeg/libjpeg-turbo/simd/jfdctflt-3dn.asm
            jpeg/libjpeg-turbo/simd/jfdctflt-sse.asm
            jpeg/libjpeg-turbo/simd/jfdctfst-mmx.asm
            jpeg/libjpeg-turbo/simd/jfdctfst-sse2.asm
            jpeg/libjpeg-turbo/simd/jfdctint-mmx.asm
            jpeg/libjpeg-turbo/simd/jfdctint-sse2.asm
            jpeg/libjpeg-turbo/simd/jidctflt-3dn.asm
            jpeg/libjpeg-turbo/simd/jidctflt-sse2.asm
            jpeg/libjpeg-turbo/simd/jidctflt-sse.asm
            jpeg/libjpeg-turbo/simd/jidctfst-mmx.asm
            jpeg/libjpeg-turbo/simd/jidctfst-sse2.asm
            jpeg/libjpeg-turbo/simd/jidctint-mmx.asm
            jpeg/libjpeg-turbo/simd/jidctint-sse2.asm
            jpeg/libjpeg-turbo/simd/jidctred-mmx.asm
            jpeg/libjpeg-turbo/simd/jidctred-sse2.asm
            jpeg/libjpeg-turbo/simd/jquant-3dn.asm
            jpeg/libjpeg-turbo/simd/jquantf-sse2.asm
            jpeg/libjpeg-turbo/simd/jquanti-sse2.asm
            jpeg/libjpeg-turbo/simd/jquant-mmx.asm
            jpeg/libjpeg-turbo/simd/jquant-sse.asm
            jpeg/libjpeg-turbo/simd/jsimdcpu.asm )
    set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -DPIC -DELF")
elseif(${ANDROID_ABI} STREQUAL "x86_64")
    MESSAGE(STATUS "JPEG: x86_64")
    set(JPEG_SOURCES
            jpeg/libjpeg-turbo/simd/jsimd_x86_64.c
            jpeg/libjpeg-turbo/simd/jccolor-sse2-64.asm
            jpeg/libjpeg-turbo/simd/jcgray-sse2-64.asm
            jpeg/libjpeg-turbo/simd/jchuff-sse2-64.asm
            jpeg/libjpeg-turbo/simd/jcsample-sse2-64.asm
            jpeg/libjpeg-turbo/simd/jdcolor-sse2-64.asm
            jpeg/libjpeg-turbo/simd/jdmerge-sse2-64.asm
            jpeg/libjpeg-turbo/simd/jdsample-sse2-64.asm
            jpeg/libjpeg-turbo/simd/jfdctflt-sse-64.asm
            jpeg/libjpeg-turbo/simd/jfdctfst-sse2-64.asm
            jpeg/libjpeg-turbo/simd/jfdctint-sse2-64.asm
            jpeg/libjpeg-turbo/simd/jidctflt-sse2-64.asm
            jpeg/libjpeg-turbo/simd/jidctfst-sse2-64.asm
            jpeg/libjpeg-turbo/simd/jidctint-sse2-64.asm
            jpeg/libjpeg-turbo/simd/jidctred-sse2-64.asm
            jpeg/libjpeg-turbo/simd/jquantf-sse2-64.asm
            jpeg/libjpeg-turbo/simd/jquanti-sse2-64.asm )
    set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -D__x86_64__ -DPIC -DELF")
else()
    MESSAGE(STATUS "JPEG: else")
    set(JPEG_SOURCES
            jpeg/libjpeg-turbo/jsimd_none.c )
endif()

add_library( jpeg
             STATIC
             jpeg/libjpeg-turbo/jcapimin.c
             jpeg/libjpeg-turbo/jcapistd.c
             jpeg/libjpeg-turbo/jaricom.c
             jpeg/libjpeg-turbo/jcarith.c
             jpeg/libjpeg-turbo/jccoefct.c
             jpeg/libjpeg-turbo/jccolor.c
             jpeg/libjpeg-turbo/jcdctmgr.c
             jpeg/libjpeg-turbo/jchuff.c
             jpeg/libjpeg-turbo/jcinit.c
             jpeg/libjpeg-turbo/jcmainct.c
             jpeg/libjpeg-turbo/jcmarker.c
             jpeg/libjpeg-turbo/jcmaster.c
             jpeg/libjpeg-turbo/jcomapi.c
             jpeg/libjpeg-turbo/jcparam.c
             jpeg/libjpeg-turbo/jcphuff.c
             jpeg/libjpeg-turbo/jcprepct.c
             jpeg/libjpeg-turbo/jcsample.c
             jpeg/libjpeg-turbo/jctrans.c
             jpeg/libjpeg-turbo/jdapimin.c
             jpeg/libjpeg-turbo/jdapistd.c
             jpeg/libjpeg-turbo/jdarith.c
             jpeg/libjpeg-turbo/jdatadst.c
             jpeg/libjpeg-turbo/jdatasrc.c
             jpeg/libjpeg-turbo/jdcoefct.c
             jpeg/libjpeg-turbo/jdcolor.c
             jpeg/libjpeg-turbo/jddctmgr.c
             jpeg/libjpeg-turbo/jdhuff.c
             jpeg/libjpeg-turbo/jdinput.c
             jpeg/libjpeg-turbo/jdmainct.c
             jpeg/libjpeg-turbo/jdmarker.c
             jpeg/libjpeg-turbo/jdmaster.c
             jpeg/libjpeg-turbo/jdmerge.c
             jpeg/libjpeg-turbo/jdphuff.c
             jpeg/libjpeg-turbo/jdpostct.c
             jpeg/libjpeg-turbo/jdsample.c
             jpeg/libjpeg-turbo/jdtrans.c
             jpeg/libjpeg-turbo/jerror.c
             jpeg/libjpeg-turbo/jfdctflt.c
             jpeg/libjpeg-turbo/jfdctfst.c
             jpeg/libjpeg-turbo/jfdctint.c
             jpeg/libjpeg-turbo/jidctflt.c
             jpeg/libjpeg-turbo/jidctfst.c
             jpeg/libjpeg-turbo/jidctint.c
             jpeg/libjpeg-turbo/jidctred.c
             jpeg/libjpeg-turbo/jmemmgr.c
             jpeg/libjpeg-turbo/jmemnobs.c
             jpeg/libjpeg-turbo/jquant1.c
             jpeg/libjpeg-turbo/jquant2.c
             jpeg/libjpeg-turbo/jutils.c
             ${JPEG_SOURCES} )

target_include_directories(jpeg PRIVATE
            jpeg/libjpeg-turbo
            jpeg/libjpeg-turbo/simd )

add_library( jpg_codec
             SHARED
             src/main/cpp/JpgCodecNativeActivity.cpp
             src/main/cpp/JpegTest.cpp
             src/main/cpp/utils.cpp )

target_include_directories( jpg_codec PRIVATE
             ${ANDROID_NDK}/sources/android/native_app_glue
             jpeg/libjpeg-turbo
             jpeg/libjpeg-turbo/simd )

target_link_libraries( jpg_codec
                       native_activity_glue
                       android
                       jpeg
                       log )
