package com.example.decoder_bitmap;

import android.graphics.*;

/**
 * Created by luocj on 2/6/18.
 */

public class BitmapFile {
    String fileName;

    byte type[];
    byte data[];

    byte pixels[];
    byte outPixels[];

    BitmapFileHeader fileHeader;

    BitmapDibHeader dibHeader;

    public BitmapFile() {
        type = new byte[2];
        type[0] = 0x42;
        type[1] = 0x4d;
    }

    public BitmapFile(String fileName) {
        this.fileName = fileName;
        fileHeader = new BitmapFileHeader();
        dibHeader = new BitmapDibHeader();
    }

    public String getPixelsHex() {
        if(pixels == null) {
            return null;
        }

        return Utils.bytesToHexString(pixels);
    }

    public String getDatasHex() {
        if(data == null) {
            return null;
        }

        return Utils.bytesToHexString(data);
    }

    public byte[] getPixels() {
        return pixels;
    }

    public byte[] getDatas() {
        return data;
    }

    public int setPixels(byte[] pixels) {
        this.pixels = pixels;
        return pixels.length;
    }

    public int setOutPixels(byte[] pixels) {
        this.outPixels = pixels;
        return outPixels.length;
    }

    public boolean setFileHeader(BitmapFileHeader header) {
        fileHeader = header;
        return true;
    }

    public boolean setDibHeader(BitmapDibHeader header) {
        dibHeader = header;
        return  true;
    }

    public boolean inversionPixels() {
        outPixels = new byte[pixels.length];
        for(int i=0; i < pixels.length; i++) {
            outPixels[i] = (byte)(0xff - pixels[i]);
        }

        return true;
    }

    public String getString() {
        StringBuffer stringBuffer = new StringBuffer("Bitmap Info \ntype:");
        stringBuffer.append(Utils.bytesToHexString(type));
        stringBuffer.append("\n");
        stringBuffer.append(fileHeader.getString());
        stringBuffer.append("\n");
        stringBuffer.append(dibHeader.getString());
        stringBuffer.append("\npixels:");
        stringBuffer.append(getPixelsHex());

        return stringBuffer.toString();
    }

    public boolean readBitmap() throws Exception {
        DataReader reader = new DataReader();
        reader.readFromFile(fileName);

        type = reader.readType();

        fileHeader.fileSize = reader.readInt();
        fileHeader.reserved1 = reader.readShort();
        fileHeader.reserved2 = reader.readShort();
        fileHeader.pixelsOffset = reader.readInt();

        dibHeader.dibSize = reader.readInt();
        dibHeader.width = reader.readInt();
        dibHeader.height = reader.readInt();
        dibHeader.planes = reader.readShort();
        dibHeader.bitPerPixel = reader.readShort();
        dibHeader.compressed = reader.readInt();
        dibHeader.pixelSize = reader.readInt();
        dibHeader.xPixelsPerMeter = reader.readInt();
        dibHeader.yPixelsPerMeter = reader.readInt();
        dibHeader.clrUsed = reader.readInt();
        dibHeader.clrImportant = reader.readInt();

        data = reader.readBytesFrom(0);

        pixels = reader.readBytesFrom(fileHeader.pixelsOffset);

        return true;
    }

    public int saveBitmap(String fileName) throws Exception {
        DataWriter writer = new DataWriter(fileHeader.fileSize);

        writer.writeBytes(type, 2);

        writer.writeInt(fileHeader.fileSize);
        writer.writeShort(fileHeader.reserved1);
        writer.writeShort(fileHeader.reserved2);
        writer.writeInt(fileHeader.pixelsOffset);

        writer.writeInt(dibHeader.dibSize);
        writer.writeInt(dibHeader.width);
        writer.writeInt(dibHeader.height);
        writer.writeShort(dibHeader.planes);
        writer.writeShort(dibHeader.bitPerPixel);
        writer.writeInt(dibHeader.compressed);
        writer.writeInt(dibHeader.pixelSize);
        writer.writeInt(dibHeader.xPixelsPerMeter);
        writer.writeInt(dibHeader.yPixelsPerMeter);
        writer.writeInt(dibHeader.clrUsed);
        writer.writeInt(dibHeader.clrImportant);

        writer.writeBytes(outPixels, outPixels.length);

        writer.writeToFile(fileName);

        return fileHeader.fileSize;
    }
}


