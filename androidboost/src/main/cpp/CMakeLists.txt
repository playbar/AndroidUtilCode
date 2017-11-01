cmake_minimum_required(VERSION 3.4.1)

#boost_1_65_1
#set(CMAKE_BUILD_TYPE "Release")
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=gnu++11 -fexceptions -frtti -fPIC  -shared")

add_library(boost SHARED
            libs/thread/src/pthread/thread.cpp
            libs/thread/src/pthread/once.cpp
            libs/filesystem/src/codecvt_error_category.cpp
            libs/filesystem/src/operations.cpp
            libs/filesystem/src/path.cpp
            libs/filesystem/src/path_traits.cpp
            libs/filesystem/src/portability.cpp
            libs/filesystem/src/utf8_codecvt_facet.cpp
            libs/system/src/error_code.cpp
            libs/program_options/src/cmdline.cpp
            libs/program_options/src/config_file.cpp
            libs/program_options/src/convert.cpp
            libs/program_options/src/options_description.cpp
            libs/program_options/src/parsers.cpp
            libs/program_options/src/positional_options.cpp
            libs/program_options/src/split.cpp
            libs/program_options/src/utf8_codecvt_facet.cpp
            libs/program_options/src/value_semantic.cpp
            libs/program_options/src/variables_map.cpp
            hellojni.c
            first.cpp
            )


target_include_directories(boost PRIVATE
                          ${CMAKE_CURRENT_SOURCE_DIR}
                           )

target_link_libraries(boost
                      android
                      log)
