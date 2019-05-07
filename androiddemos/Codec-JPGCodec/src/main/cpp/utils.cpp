//
// Created by luocj on 2/12/18.
//
#include<stdio.h>

#include "utils.h"

int myHex2Str(const byte* src,  byte* dest, int nSrcLen ) {
    int  i;
    char tmp[3];

    for( i = 0; i < nSrcLen; i++ ) {
        sprintf( tmp, "%02X", (byte) src[i] );
        memcpy( &dest[i * 2], tmp, 2 );
    }
    return i * 2;
}

void my_show_byte (const char* str, byte bytes[], int size) {
    byte hexStr[size * 2 + 1];
    int len = myHex2Str(bytes, hexStr, size);
    hexStr[size * 2] = '\0';
    ALOGE("png_show_byte %s %d bytes %s", str, len, hexStr);
}
