package com.bar.media;

import android.app.Activity;
import android.media.AsyncPlayer;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bar.media.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class AsyncPlayerDemo extends Activity {


//    @BindView(R.id.iv_async_play)
    ImageView mIvPlay;

    private boolean isPlay = false ;

    private AsyncPlayer mPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asyncplayer_demo_layout);
        mIvPlay = (ImageView) findViewById(R.id.iv_async_play);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        mPlayer = new AsyncPlayer("play");
    }

//    @OnClick(R.id.iv_async_play)
    public void onClick(){
        if(isPlay){
            isPlay = false ;
            mPlayer.stop();
            mIvPlay.setImageResource(R.mipmap.play);
        }else{
            isPlay = true ;
            Uri uri = Uri.parse("http://yinyueshiting.baidu.com/data2/music/2e9b991ae1825e150bbd38e49b6f2d59/541990292/2420784371501560061320.mp3?xcode=b65352eb91fe15b3c9bf3d409e407d1c");
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                AudioAttributes mAudioAttributes = new AudioAttributes.Builder()
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .setUsage(AudioAttributes.USAGE_MEDIA)
                        .build() ;
                mPlayer.play(this, uri, true, mAudioAttributes);
            }else{
                mPlayer.play(this, uri, true, AudioManager.STREAM_MUSIC);
            }
            mIvPlay.setImageResource(R.mipmap.stop);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(isPlay){
            mPlayer.stop();
        }
    }
}
