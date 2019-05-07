//
// Created by luocj on 2/12/18.
//

#ifndef ANDROIDDEBUGDEMOS_JPEGTEST_CPP_H
#define ANDROIDDEBUGDEMOS_JPEGTEST_CPP_H

#include "utils.h"

void jpgfile_to_jpgmem(char* jpg_file, byte** jpg, int* size);

void jpgmem_to_bgr(byte* jpg, int size, byte** bgr, int* b_size, int* w, int* h);

void readJpegFile(char* fileName);

#endif //ANDROIDDEBUGDEMOS_JPEGTEST_CPP_H