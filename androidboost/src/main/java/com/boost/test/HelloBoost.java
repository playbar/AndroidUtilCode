package com.boost.test;

import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;


public class HelloBoost extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        testBoostArray();

        /* Create a TextView and set its content.
         * the text is retrieved by calling a native
         * function.
         */
        TextView  tv = new TextView(this);
        tv.setText( stringFromJNI() );
        setContentView(tv);
    }

    /* A native method that is implemented by the
     * 'hello-boost' native library, which is packaged
     * with this application.
     */
    public native String  stringFromJNI();

    public native void testBoostArray();

    /* This is another native method declaration that is *not*
     * implemented by 'hello-boost'. This is simply to show that
     * you can declare as many native methods in your Java code
     * as you want, their implementation is searched in the
     * currently loaded native libraries only the first time
     * you call them.
     *
     * Trying to call this function will result in a
     * java.lang.UnsatisfiedLinkError exception !
     */
    public native String  unimplementedStringFromJNI();

    /* this is used to load the 'hello-boost' library on application
     * startup. The library has already been unpacked into
     * /data/data/com.example.HelloBoost/lib/libhello-boost.so at
     * installation time by the package manager.
     */
    static {
        System.loadLibrary("boost");
    }
}
