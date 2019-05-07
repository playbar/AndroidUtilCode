package com.example.decoder_bitmap;

/**
 * Created by luocj on 2/7/18.
 */

public class BitmapFileHeader {
    int     fileSize;
    short   reserved1;
    short   reserved2;
    int     pixelsOffset;

    public String getString() {
        StringBuffer stringBuffer = new StringBuffer("fileSize:0x");
        stringBuffer.append(Integer.toHexString(fileSize));
        stringBuffer.append("\nreserved1:0x");
        stringBuffer.append(Integer.toUnsignedString(reserved1, 16));
        stringBuffer.append("\nreserved2:0x");
        stringBuffer.append(Integer.toUnsignedString(reserved2, 16));
        stringBuffer.append("\npixelsOffset:0x");
        stringBuffer.append(Integer.toHexString(pixelsOffset));

        return stringBuffer.toString();
    }
}