cmake_minimum_required(VERSION 3.4.1)

add_library(boost SHARED
            hellojni.c
            )

# Include libraries needed for hello-jni lib
target_link_libraries(boost
                      android
                      log)
