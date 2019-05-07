package com.luocj.av.miaiaudioplayer;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;

public class MiaiAudioPlayerActivity extends Activity {

    private AudioManager mAudioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miai_audio_player);

        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        String name = new String("");
        name.contains("");
    }
}
