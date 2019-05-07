package com.luocj.demos.notification;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NotificationActivity extends Activity {

    private Context mContext;
    private Boolean mOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        mContext = getBaseContext();

        TextView textView = findViewById(R.id.hello_textview);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AudioStatusNotify.sendAudioStatusNotification(mContext, "com.tencent.mm", mOn);
                mOn = !mOn;
            }
        });
    }
}
