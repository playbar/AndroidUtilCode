package com.luocj.demos.resourceloader;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.TextView;

public class ResourceLoaderActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource_loader);

        TextView mTotal = findViewById(R.id.textview_message);

        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        String summarySub = (!vibrator.hasVibrator())? "" : getResources().getString(R.string.total_info_sub);
        String summary = getResources().getString(R.string.total_info, summarySub);
        mTotal.setText(summary);
    }
}
