package com.example.nativebroardcast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class NativeBroardCastActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native_broard_cast);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Intent intent = new Intent();
        intent.setAction("android.iris.action.IRIS_CONFIG_CHANGED");
        sendBroadcast(intent);
    }
}
