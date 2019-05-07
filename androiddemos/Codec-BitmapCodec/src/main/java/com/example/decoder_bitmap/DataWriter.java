package com.example.decoder_bitmap;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by luocj on 2/7/18.
 */

public class DataWriter {
    protected byte buf[];

    protected int pos;

    protected int mark = 0;

    protected int count;

    public  DataWriter(int count) {
        pos = 0;
        this.count = count;
        buf = new byte[count];
    }

    public int writeToFile(String fileName) {
        try {
            File file = new File(fileName);
            FileOutputStream os = new FileOutputStream(file);
            os.write(buf, 0, count);
            os.flush();
            os.close();
            MyLog.d("writeToFile " + fileName);
        } catch (Exception e) {
            MyLog.d("writeToFile fail " + e.toString());
        } finally {
            return count;
        }
    }

    public int writeBytes(byte value[], int size) throws Exception {
        if (count < pos + value.length) {
            throw new Exception("can not write bytes value at " + pos);
        }

        for (int i = 0; i < value.length; i++) {
            buf[pos++] = value[i];
        }

        for (int i = 0; i < size - value.length; i++) {
            buf[pos++] = 0;
        }

        return pos;
    }

    public int writeInt(int value) throws Exception {
        if (count < pos + 4) {
            throw new Exception("can not write int value at " + pos);
        }

        byte[] bytes = Utils.int2Byte(value);

        MyLog.d("writeInt " + value + " " + " [" + bytes[0] + " " + bytes[1] + " " + bytes[2] + " " + bytes[3] + "]");

        writeBytes(bytes,4);

        return pos;
    }

    public int writeShort(short value) throws Exception {
        if (count < pos + 2) {
            throw new Exception("can not write short value at " + pos);
        }

        byte[] bytes = Utils.short2Byte(value);

        MyLog.d("writeShort " + value + " " + " [" + bytes[0] + " " + bytes[1] + "]");

        writeBytes(bytes,2);

        return pos;
    }
}