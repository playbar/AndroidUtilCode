//
// Created by luocj on 2/12/18.
//

#ifndef ANDROIDDEBUGDEMOS_PNGTEST_CPP_H
#define ANDROIDDEBUGDEMOS_PNGTEST_CPP_H

#include <png.h>

void readPngFile(char *name);

void writePngFile(char *fileName, png_byte* src , int width, int height, int format);

void buildPngFile(char *fileName);

#endif //ANDROIDDEBUGDEMOS_PNGTEST_CPP_H
