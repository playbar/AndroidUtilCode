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

        TextView  tv = new TextView(this);
        tv.setText( stringFromJNI() );
        setContentView(tv);
    }

    public native String  stringFromJNI();

    public native void testBoostArray();


    static {
        System.loadLibrary("boost");
    }
}
