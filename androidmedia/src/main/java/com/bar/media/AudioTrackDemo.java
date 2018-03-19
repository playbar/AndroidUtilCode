package com.bar.media;

import android.app.Activity;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bar.media.R;

import java.io.InputStream;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * author 岳明明
 * description
 * Created by yzm on 2017/7/31.
 */

public class AudioTrackDemo extends Activity {

    @BindView(R.id.iv_autdiotrack_play)
    ImageView mIvAutdiotrackPlay;

    @BindView(R.id.bt_bs)
    Button mButton ;

    @BindView(R.id.bt_hf)
    Button hButton ;

    @BindView(R.id.bt_ks)
    Button kButton ;

    private int mBufSize;
    private AudioTrack mMAudioTrack;

    private boolean isLoadResource = false ;

    private boolean loading = true ;

    private boolean isPlay = false ;

    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            Toast toast = Toast.makeText(AudioTrackDemo.this, "播放结束...", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            mMAudioTrack.stop();
            mIvAutdiotrackPlay.setImageResource(R.mipmap.play);
        }
    } ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autdiotrack_demo_layout);
        ButterKnife.bind(this);
        init() ;
    }

    private void init() {
        // 获取最小缓冲区
        mBufSize = AudioTrack.getMinBufferSize(44100, AudioFormat.CHANNEL_OUT_MONO, AudioFormat.ENCODING_PCM_16BIT);
        // 实例化AudioTrack(设置缓冲区为最小缓冲区的2倍，至少要等于最小缓冲区)
        mMAudioTrack = new AudioTrack(AudioManager.STREAM_MUSIC, 44100, AudioFormat.CHANNEL_OUT_STEREO,
                AudioFormat.ENCODING_PCM_16BIT, mBufSize * 2, AudioTrack.MODE_STREAM);
        mMAudioTrack.setPlaybackPositionUpdateListener(new AudioTrack.OnPlaybackPositionUpdateListener() {
            @Override
            public void onMarkerReached(AudioTrack track) {
                //播放结束
                mHandler.sendEmptyMessage(0) ;
            }

            @Override
            public void onPeriodicNotification(AudioTrack track) {
            }
        });
        // 设置音量
        mMAudioTrack.setVolume(2f);
        // 设置播放频率
//        mMAudioTrack.setPlaybackRate(10);
        mMAudioTrack.play();
    }


    @OnClick({R.id.iv_autdiotrack_play, R.id.bt_bs, R.id.bt_hf, R.id.bt_ks})
    public void onClick(View v){
        switch (v.getId()){
            case R.id.iv_autdiotrack_play:
                if(isLoadResource){
                    if(isPlay){
                        isPlay = false ;
                        mIvAutdiotrackPlay.setImageResource(R.mipmap.play);
                    }else{
                        isPlay = true ;
                        mIvAutdiotrackPlay.setImageResource(R.mipmap.pause);
                    }
                    /*if(mMAudioTrack.getPlayState() == AudioTrack.PLAYSTATE_PAUSED){
                        System.out.println("开始播放...");
                        //mMAudioTrack.play();
                        isPlay = true ;
                        mIvAutdiotrackPlay.setImageResource(R.mipmap.pause);
                    }else{
                        isPlay = false ;
//                        mMAudioTrack.pause();
                        mIvAutdiotrackPlay.setImageResource(R.mipmap.play);
                    }*/
                }else{
                    mIvAutdiotrackPlay.setImageResource(R.mipmap.pause);
                    loadResource();
                    isLoadResource = true ;
                    isPlay = true ;
                }
                break ;
            case R.id.bt_bs:
                mMAudioTrack.setPlaybackRate((int)(44100/1.5f)) ;
                break ;
            case R.id.bt_hf:
                mMAudioTrack.setPlaybackRate(44100) ;
                break ;
            case R.id.bt_ks:
                mMAudioTrack.setPlaybackRate((int)(44100*1.2f)) ;
                break ;

        }
    }

    private void loadResource() {
        new Thread(new Runnable() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void run() {
                // 获取音乐文件输入流
                InputStream is = getResources().openRawResource(R.raw.zbc);
                byte[] buffer = new byte[mBufSize * 4];
                int len;
                try {
                    while (loading){
                        System.out.println("循环中...");
                        while (isPlay&&(len = is.read(buffer, 0, buffer.length)) != -1) {
                            System.out.println("读取数据中...");
                            // 将读取的数据，写入Audiotrack
                            mMAudioTrack.write(buffer, 0, buffer.length);
                        }
                        if(isPlay){
                            loading = false ;
                            is.close();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mMAudioTrack.getPlayState() == AudioTrack.PLAYSTATE_PLAYING){
            loading = false ;
            mMAudioTrack.stop();
            mMAudioTrack.release();
            mMAudioTrack = null ;
        }
    }
}
