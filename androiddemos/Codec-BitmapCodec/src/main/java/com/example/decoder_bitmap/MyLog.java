package com.example.decoder_bitmap;

import android.util.Log;

/**
 * Created by luocj on 2/7/18.
 */

public class MyLog {
    private static String TAG = "BitmapFile";

    private static boolean DEBUG = true;

    public static int e(String msg) {
        return Log.e(TAG, msg);
    }
    public static int w(String msg) {
        if(DEBUG) {
            return Log.w(TAG, msg);
        }
        return 0;
    }
    public static int d(String msg) {
        if(DEBUG) {
            return Log.d(TAG, msg);
        }
        return 0;
    }
    public static int i(String msg) {
        if(DEBUG) {
            return Log.i(TAG, msg);
        }
        return 0;
    }
    public static int v(String msg) {
        if(DEBUG) {
            return Log.e(TAG, msg);
        }
        return 0;
    }
}
