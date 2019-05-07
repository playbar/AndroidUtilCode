package com.lethe.luocj.setringermode;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;

public class SetRingerModeActivity extends Activity {

    private AudioManager mAudioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_ringer_mode);

        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        findViewById(R.id.button_silent).setOnClickListener(mOnClickListener);

        findViewById(R.id.button_vibrate).setOnClickListener(mOnClickListener);

        findViewById(R.id.button_normal).setOnClickListener(mOnClickListener);
    }

    View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_silent:
                    mAudioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
                    break;
                case R.id.button_vibrate:
                    mAudioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
                    break;
                case R.id.button_normal:
                    mAudioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
                    break;
            }
        }
    };
}
