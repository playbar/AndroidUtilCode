package com.lethe.luocj.av08_audioheadset;

import android.app.Activity;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AudioHeadSetActivity extends Activity {

    private static final String TAG = "AudioHeadSetActivity";

    private AudioManager mAudioManager;

    private String mString;

    private TextView mTextview;

    private WiredHeadsetCallback mWiredHeadsetCallback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_head_set);

        mTextview = (TextView) findViewById(R.id.textview);

        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        mWiredHeadsetCallback = new WiredHeadsetCallback();

        mAudioManager.registerAudioDeviceCallback(mWiredHeadsetCallback, null);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");// HH:mm:ss
        //获取当前时间
        Date date = new Date(System.currentTimeMillis());

        mString = simpleDateFormat.format(date) + ":registerAudioDeviceCallback\n";
    }

    /**
     * Receiver for wired headset plugged and unplugged events.
     */
    private class WiredHeadsetCallback extends AudioDeviceCallback {
        @Override
        public void onAudioDevicesAdded(AudioDeviceInfo[] addedDevices) {
            Log.e(TAG, "xm-av: onAudioDevicesAdded WHC.oADA");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");// HH:mm:ss
            //获取当前时间
            Date date = new Date(System.currentTimeMillis());
            mString += simpleDateFormat.format(date) + ":onAudioDevicesAdded\n";
            try {
                updateHeadsetStatus();
            } finally {

            }
        }

        @Override
        public void onAudioDevicesRemoved(AudioDeviceInfo[] devices) {
            Log.e(TAG, "xm-av: onAudioDevicesRemoved WHC.oADR");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");// HH:mm:ss
            //获取当前时间
            Date date = new Date(System.currentTimeMillis());
            mString += simpleDateFormat.format(date) + ":onAudioDevicesRemoved\n";
            try {
                updateHeadsetStatus();
            } finally {

            }
        }

        private void updateHeadsetStatus() {
            final boolean isPluggedIn = isWiredHeadsetPluggedIn();
            Log.e(TAG, "xm-av: ACTION_HEADSET_PLUG event, plugged in " + isPluggedIn);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");// HH:mm:ss
            //获取当前时间
            Date date = new Date(System.currentTimeMillis());
            mString += simpleDateFormat.format(date) + ":isPluggedIn:" + isPluggedIn + "\n";
            mHandler.sendEmptyMessage(0);
        }
    }

    private boolean isWiredHeadsetPluggedIn() {
        AudioDeviceInfo[] devices = mAudioManager.getDevices(AudioManager.GET_DEVICES_ALL);
        boolean isPluggedIn = false;
        for (AudioDeviceInfo device : devices) {
            switch (device.getType()) {
                case AudioDeviceInfo.TYPE_WIRED_HEADPHONES:
                case AudioDeviceInfo.TYPE_WIRED_HEADSET:
                case AudioDeviceInfo.TYPE_USB_HEADSET:
                case AudioDeviceInfo.TYPE_USB_DEVICE:
                    isPluggedIn = true;
            }
            if (isPluggedIn) {
                break;
            }
        }
        return isPluggedIn;
    }

    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    updateViews();
            }
        }
    };

    private void updateViews() {
        mTextview.setText(mString);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mAudioManager.unregisterAudioDeviceCallback(mWiredHeadsetCallback);
    }
}
