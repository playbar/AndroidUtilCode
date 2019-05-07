package com.lethe.luocj.audiomanageradjustvolume;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AudioManagerAdjustVolumeActivity extends Activity {
    public static final int FLAG_BLUETOOTH_ABS_VOLUME = 1 << 6;

    private AudioManager mAudioManager;

    private int mVolume = 0;

    private Button mUpVolumeButton;
    private Button mDownVolumeButton;

    private TextView mVolumeTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_manager_adjust_volume);

        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        mVolume = mAudioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

        mUpVolumeButton = findViewById(R.id.button_up_volume);
        mUpVolumeButton.setOnClickListener(mOnClickListener);

        mDownVolumeButton = findViewById(R.id.button_down_volume);
        mDownVolumeButton.setOnClickListener(mOnClickListener);

        mVolumeTextview = findViewById(R.id.textview_volume);
        mVolumeTextview.setText("volume " + mVolume);
    }

    View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_up_volume:
                    mVolume++;
                    break;

                case R.id.button_down_volume:
                    mVolume--;
                    break;
            }
            adjustVolue(mVolume);
        }
    };

    private void adjustVolue(int volume) {
        mAudioManager.setStreamVolume(AudioManager.STREAM_MUSIC, volume,
                AudioManager.FLAG_SHOW_UI | FLAG_BLUETOOTH_ABS_VOLUME);
        mVolumeTextview.setText("volume " + volume);
    }
}
