package com.lethe.luocj.av07_audiofocus;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.ImageView;

public class AudioFocusActivity extends Activity implements AudioManager.OnAudioFocusChangeListener {
    private static final String TAG = AudioFocusActivity.class.getSimpleName();

    private AudioManager mAudioManager;

    private AudioFocusRequest mAudioFocusRequest;

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_focus);
        mImageView = (ImageView) findViewById(R.id.imageview);
    }

    @Override
    public void onAudioFocusChange(int focusChange) {
        Log.e(TAG, "xm-av: onAudioFocusChange " + focusChange);
    }

    Handler mHandler = new Handler() {
        public void handleMessage(Message msg) {
        }
    };

    private void requestAudioFocus() {
        AudioAttributes attributes = new AudioAttributes.Builder()
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .build();

        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        mAudioFocusRequest = new AudioFocusRequest.Builder(AudioManager.AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK)
                .setOnAudioFocusChangeListener(this, mHandler /* no Handler for this legacy API */)
                .setAcceptsDelayedFocusGain(false)
                .setWillPauseWhenDucked(false)
                .setAudioAttributes(attributes)
                .build();

        int ret = mAudioManager.requestAudioFocus(mAudioFocusRequest);
        Log.e(TAG, "xm-av: requestAudioFocus ret " + ret);
    }

    @Override
    protected void onResume() {
        super.onResume();
        requestAudioFocus();

        int[] taskIds = null;

        resizeTask(0, null, 0);

        //Log.e(TAG, "xm-av: abandonAudioFocusRequest ret " + taskIds.length);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        int ret = mAudioManager.abandonAudioFocusRequest(mAudioFocusRequest);
        Log.e(TAG, "xm-av: abandonAudioFocusRequest ret " + ret);
    }

    public int resizeTask(int taskId, Rect bounds, int resizeMode) {
        return -1;
    }
}
