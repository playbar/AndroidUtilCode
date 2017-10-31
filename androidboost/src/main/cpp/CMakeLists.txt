cmake_minimum_required(VERSION 3.4.1)

#boost_1_65_1
#set(CMAKE_BUILD_TYPE "Release")
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=gnu++11 -fexceptions -fPIC  -shared")

add_library(boost SHARED
            hellojni.c
            first.cpp
            hello-boost.cpp
            )


target_include_directories(boost PRIVATE
                          ${CMAKE_CURRENT_SOURCE_DIR}
                           )

target_link_libraries(boost
                      android
                      log)
