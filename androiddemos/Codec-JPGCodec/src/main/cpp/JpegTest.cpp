//
// Created by luocj on 2/12/18.
//
#include <malloc.h>
#include <string.h>

#include <jpeglib.h>

#include "JpegTest.h"

void jpgfile_to_jpgmem(char *jpg_file,byte **jpg,int *size)
{
    FILE *fp = fopen(jpg_file,"rb");
    if(fp == NULL) return;

    fseek(fp,0,SEEK_END);
    int length = ftell(fp);
    fseek(fp,0,SEEK_SET);

    *jpg = new byte[length];
    fread(*jpg,length,1,fp);
    *size = length;

    fclose(fp);
}

void jpgmem_to_bgr(byte *jpg,int size,byte **bgr,int *b_size,int *w,int *h)
{
    struct jpeg_decompress_struct cinfo;
    struct jpeg_error_mgr jerr;
    cinfo.err = jpeg_std_error(&jerr);

    jpeg_create_decompress(&cinfo);
    jpeg_mem_src(&cinfo,jpg,size);

    jpeg_read_header(&cinfo,TRUE);
    jpeg_start_decompress(&cinfo);

    unsigned long width = cinfo.output_width;
    unsigned long height = cinfo.output_height;
    unsigned short depth = cinfo.output_components;

    *w = width;
    *h = height;
    *b_size = width*height*depth;
    *bgr = (byte*)malloc(width*height*depth);
    memset(*bgr,0,width*height*depth);

    JSAMPARRAY buffer = (*cinfo.mem->alloc_sarray)((j_common_ptr)&cinfo, JPOOL_IMAGE, width*depth,1);

    byte *point = (*bgr)+(height-cinfo.output_scanline-1)*(width*depth);
    while(cinfo.output_scanline<height)
    {
        jpeg_read_scanlines(&cinfo, buffer, 1);
        memcpy(point, *buffer, width*depth);
        point -= width*depth;
    }

    jpeg_finish_decompress(&cinfo);
    jpeg_destroy_decompress(&cinfo);
}

void readJpegFile(char* fileName) {
    byte* jpg = static_cast<byte*> (malloc(2048));
    int size = 0;

    jpgfile_to_jpgmem(fileName, &jpg, &size);

    my_show_byte("Jpeg raw data", jpg, size);

    ALOGE("jpgfile_to_jpgmem size %d", size);

    byte* rgb = static_cast<byte*> (malloc(1024));
    int rgb_size = 0;
    int w = 0;
    int h = 0;
    jpgmem_to_bgr(jpg, size, &rgb, &rgb_size, &w, &h);

    ALOGE("jpgmem_to_bgr rgb_size %d w %d h %d", rgb_size, w, h);

    my_show_byte("Jpeg rgb data", rgb, rgb_size);

    free(rgb);
    free(jpg);
}