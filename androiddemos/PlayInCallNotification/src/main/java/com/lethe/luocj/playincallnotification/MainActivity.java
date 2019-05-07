package com.lethe.luocj.playincallnotification;

import android.app.Activity;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.IRingtonePlayer;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;

public class MainActivity extends Activity {
    private Uri mInCallNotificationUri;
    private AudioAttributes mInCallNotificationAudioAttributes;
    private float mInCallNotificationVolume;

    AudioManager mAudioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        mInCallNotificationUri = Uri.parse("file://" + "/system/media/audio/ui/InCallNotification.ogg");

        mInCallNotificationAudioAttributes = new AudioAttributes.Builder()
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .setUsage(AudioAttributes.USAGE_VOICE_COMMUNICATION)
                .build();

        mInCallNotificationVolume = 1f;

        findViewById(R.id.textview_helloworld).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playInCallNotification();
            }
        });
    }

    protected void playInCallNotification() {
        new Thread() {
            @Override
            public void run() {
                final long identity = Binder.clearCallingIdentity();
                try {
                    final IRingtonePlayer player = mAudioManager.getRingtonePlayer();
                    if (player != null) {
                        player.play(new Binder(), mInCallNotificationUri,
                                mInCallNotificationAudioAttributes,
                                mInCallNotificationVolume, false);
                    }
                } catch (RemoteException e) {
                } finally {
                    Binder.restoreCallingIdentity(identity);
                }
            }
        }.start();
    }
}
