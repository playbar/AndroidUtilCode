package com.example.decoder_bitmap;

/**
 * Created by luocj on 2/7/18.
 */

public class Utils {
    public static byte[] short2Byte(short number) {
        int temp = number;
        byte[] b = new byte[2];
        for (int i = 0; i < b.length; i++) {
            b[i] = new Integer(temp & 0xff).byteValue();// 将最低位保存在高位
            temp = temp >> 8; // 向右移8位
        }
        return b;
    }

    public static byte[] int2Byte(final int integer) {
        int byteNum = (40 - Integer.numberOfLeadingZeros(integer < 0 ? ~integer : integer)) / 8;
        byte[] byteArray = new byte[4];

        for (int n = 0; n < byteNum; n++) {
            byteArray[n] = (byte) (integer >>> (n * 8));
        }

        MyLog.d("int2Byte integer " + integer + " byteNum " + byteNum + " [" + byteArray[0] + " " + byteArray[1] + " " + byteArray[2] + " " + byteArray[3] + "]");

        return (byteArray);
    }

    public static short char2short(char[] chars) {
        if(chars.length > 2) {
            MyLog.e("char2short fail too many elment [" + chars[0] + " " + chars[1] + " " + chars[3] + "]");
        }

        short ret = 0;
        for(int i = 0; i < chars.length; i++) {
            ret += (short)(((short) chars[i]) << (8 * i));
        }

        return ret;
    }

    public static String bytesToHexString(byte[] src){
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }
}
