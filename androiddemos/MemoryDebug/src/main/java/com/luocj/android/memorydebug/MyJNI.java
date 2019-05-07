package com.luocj.android.memorydebug;

/**
 * Created by luocj on 7/18/17.
 */

public class MyJNI {
    static {
        System.loadLibrary("MyJNI-lib");
    }

    public static native String sayHello();
}
