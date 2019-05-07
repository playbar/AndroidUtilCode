package com.lethe.luocj.dynamicadjustvolume;

import android.app.Activity;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

import java.io.IOException;

public class MusicPlayerActivity extends Activity {

    private static String TAG = MusicPlayerActivity.class.getSimpleName();

    enum Status {
        IDLE,
        PREPARED,
        PLAYING,
        PAUSED,
        STOP
    }

    enum PlayError {
        NO_ERROR,
        INVALID_URL,
        SET_DATASOURCE_ERROR,
        PREPARE_ERROR

    }

    private Status mStatus;

    private EditText mMusicUrlEdit;

    private String mMusicUrl = "";

    private MediaPlayer mMediaPlayer;

    private SeekBar mVolumeBar;

    private int mProgress = 5;

    private float mVolume = progress2volume(mProgress);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);

        mMusicUrlEdit = (EditText) findViewById(R.id.edittext_music_url);

        Button playButton = (Button) findViewById(R.id.button_play);
        playButton.setOnClickListener(mOnClickListener);

        Button pauseButton = (Button) findViewById(R.id.button_pause);
        pauseButton.setOnClickListener(mOnClickListener);

        Button stopButton = (Button) findViewById(R.id.button_stop);
        stopButton.setOnClickListener(mOnClickListener);

        mVolumeBar = findViewById(R.id.seekbar_volume);
        mVolumeBar.setProgress(mProgress);
        mVolumeBar.setOnSeekBarChangeListener(mSeekBarChangeListener);

        mStatus = Status.IDLE;
    }

    View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button_play:
                    playMusic();
                    break;

                case R.id.button_pause:
                    pauseMusic();
                    break;

                case R.id.button_stop:
                    stopMusic();
                    break;
            }
        }
    };

    MediaPlayer.OnCompletionListener mOnCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            if(mediaPlayer == mMediaPlayer) {
                mStatus = Status.PREPARED;
                playMusic();
            }
        }
    };

    SeekBar.OnSeekBarChangeListener mSeekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            setmVolume(progress);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    private float progress2volume(int progress) {
        return ((float) progress) / 10;
    }

    private String getUrl() {

        String newUrl = mMusicUrlEdit.getText().toString();

        if(!newUrl.isEmpty() && !newUrl.equals(mMusicUrl)) {
            return newUrl;
        }

        return "";
    }

    private PlayError prepareMusic(String newUrl) {
        if(mMediaPlayer == null) {
            mMediaPlayer = new MediaPlayer();
        } else {
            mMediaPlayer.reset();
        }

        if(!newUrl.isEmpty()) {
            mMusicUrl = newUrl;
        } else if (mMusicUrl.isEmpty()) {
            return PlayError.INVALID_URL;
        }

        try {
            PermisionUtils.verifyStoragePermissions(this);
            mMediaPlayer.setDataSource(mMusicUrl);

        } catch (IOException e) {
            Log.e(TAG, e.toString());
            return PlayError.SET_DATASOURCE_ERROR;
        }

        AudioAttributes attributes = new AudioAttributes.Builder()
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .build();

        mMediaPlayer.setAudioAttributes(attributes);

        mMediaPlayer.setVolume(mVolume, mVolume);

        try {
            mMediaPlayer.prepare();
        } catch (IOException e) {
            Log.e(TAG, e.toString());
            return PlayError.PREPARE_ERROR;
        }

        mMediaPlayer.setOnCompletionListener(mOnCompletionListener);

        mStatus = Status.PREPARED;

        return PlayError.NO_ERROR;
    }

    private void playMusic() {
        String newUrl = getUrl();
        if(mStatus == Status.IDLE || mStatus == Status.STOP || (!newUrl.isEmpty())) {
            prepareMusic(newUrl);
        }

        if (mStatus == Status.PREPARED || mStatus == Status.PAUSED) {
            mMediaPlayer.start();
            mStatus = Status.PLAYING;
        }
    }


    private void pauseMusic() {
        if(mStatus == Status.PLAYING) {
            mMediaPlayer.pause();
            mStatus = Status.PAUSED;
        }
    }

    private void stopMusic() {
        if(mStatus != Status.IDLE) {
            mMediaPlayer.stop();
            mStatus = Status.STOP;
        }
    }

    private void setmVolume(int progress) {
        float volume = progress2volume(progress);
        if(mMediaPlayer != null && mVolume != volume) {
            mMediaPlayer.setVolume(volume, volume);
        }
        mVolume = volume;
    }
}
