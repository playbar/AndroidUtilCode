package com.example.decoder_bitmap;

/**
 * Created by luocj on 2/7/18.
 */

public class BitmapDibHeader {
    int     dibSize;
    int     width;
    int     height;
    short   planes;
    short   bitPerPixel;
    int     compressed;
    int     pixelSize;
    int     xPixelsPerMeter;
    int     yPixelsPerMeter;
    int     clrUsed;
    int     clrImportant;
    int     bytePerPixel;

    public String getString() {
        StringBuffer stringBuffer = new StringBuffer("dibSize:0x");
        stringBuffer.append(Integer.toHexString(dibSize));
        stringBuffer.append("\nwidth:0x");
        stringBuffer.append(Integer.toHexString(width));
        stringBuffer.append("\nheight:0x");
        stringBuffer.append(Integer.toHexString(height));
        stringBuffer.append("\nplanes:0x");
        stringBuffer.append(Integer.toUnsignedString(planes, 16));
        stringBuffer.append("\nbitPerPixel:0x");
        stringBuffer.append(Integer.toUnsignedString(bitPerPixel, 16));
        stringBuffer.append("\ncompressed:0x");
        stringBuffer.append(Integer.toHexString(compressed));
        stringBuffer.append("\npixelSize:0x");
        stringBuffer.append(Integer.toHexString(pixelSize));
        stringBuffer.append("\nxPixelsPerMeter:0x");
        stringBuffer.append(Integer.toHexString(xPixelsPerMeter));
        stringBuffer.append("\nyPixelsPerMeter:0x");
        stringBuffer.append(Integer.toHexString(yPixelsPerMeter));
        stringBuffer.append("\nclrUsed:0x");
        stringBuffer.append(Integer.toHexString(clrUsed));
        stringBuffer.append("\nclrImportant:0x");
        stringBuffer.append(Integer.toHexString(clrImportant));

        return stringBuffer.toString();
    }
}
