package com.lethe.luocj.debugjavareferene;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class DebugJavaRefereneActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug_java_referene);

        TextView textView = findViewById(R.id.textview_number);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.invalidate();
            }
        });

        int index = 0;

        index += 10;

        for(int i=0;i< 5;i++) {
            index = testReference(index);
            Log.e("LCJ", "index " + index);
        }
    }

    private static int testReference(int index) {

        for(int i=0;i < 100; i++) {
            index++;
        }

        return index;
    }
}
