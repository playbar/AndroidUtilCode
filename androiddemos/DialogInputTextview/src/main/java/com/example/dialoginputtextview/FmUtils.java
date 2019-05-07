package com.example.dialoginputtextview;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;

/**
 * Created by luocj on 10/27/17.
 */

public class FmUtils {
    private static final String TAG = "FmUtils";

    /*  Fix for bug 589228 forbid turn on FM in airplane mode. @{ */
    public static boolean isAirplane(Context context) {
        boolean isair = Settings.System.getInt(context.getContentResolver(), Settings.System.AIRPLANE_MODE_ON, 0) ==1;
        Log.d(TAG,"isAirplaneMode: "+isair );
        return  isair;
    }

    //Modify for 672231,The save button can't be clicked.
    public static int convertSpToPx(Context context, float spValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }
}
