package com.bar.media;

import android.app.Activity;
import android.media.JetPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bar.media.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class JetPlayerDemo extends Activity {

    private static final String TAG = JetPlayerDemo.class.getSimpleName() ;

    @BindView(R.id.iv_jet_play)
    ImageView play ;

    @BindView(R.id.bt_play_seg1)
    Button seg1 ;

    @BindView(R.id.bt_play_seg2)
    Button seg2 ;


    private boolean isPlay = false ;
    private JetPlayer mMJet;
    private byte mSSegmentID = 0 ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jetplayer_demo_layout);
        ButterKnife.bind(this) ;
        initJetPlayer() ;
    }

    private void initJetPlayer() {
        // 获取JetPlayer播放器
        mMJet = JetPlayer.getJetPlayer();
        //清空播放队列
        mMJet.clearQueue() ;
        //绑定事件监听
        mMJet.setEventListener(new JetPlayer.OnJetEventListener() {
            //播放次数记录
            int playNum = 1 ;
            @Override
            public void onJetEvent(JetPlayer player, short segment, byte track, byte channel, byte controller, byte value) {
                Log.i(TAG,"----->onJetEvent") ;
            }

            @Override
            public void onJetUserIdUpdate(JetPlayer player, int userId, int repeatCount) {
                Log.i(TAG,"----->onJetUserIdUpdate") ;
            }

            @Override
            public void onJetNumQueuedSegmentUpdate(JetPlayer player, int nbSegments) {
                Log.i(TAG,"----->onJetNumQueuedSegmentUpdate") ;
            }

            @Override
            public void onJetPauseUpdate(JetPlayer player, int paused) {
                Log.i(TAG,"----->onJetPauseUpdate") ;
            }
        });
        //加载资源
        mMJet.loadJetFile(getResources().openRawResourceFd(R.raw.level1)) ;
    }

    @OnClick({R.id.iv_jet_play, R.id.bt_play_seg1, R.id.bt_play_seg2})
    public void onClick(View v){
        switch (v.getId()){
            case R.id.iv_jet_play:
                if(isPlay){
                    isPlay = false ;
                    mMJet.pause() ;
                    mMJet.clearQueue() ;
                    play.setImageResource(R.mipmap.play);
                }else{
                    isPlay = true ;
                    mMJet.clearQueue() ;
                    //指定播放序列
                    mMJet.queueJetSegment(0, 0, 0, 0, 0, mSSegmentID);
                    mMJet.queueJetSegment(1, 0, 1, 0, 0, mSSegmentID);
                    //试过，没有效果，猜测：可能是音频文件中只有2个音符片段
                    //mJet.queueJetSegment(2, 0, 1, 0, 0, sSegmentID);
                    //开始播放
                    mMJet.play() ;
                    play.setImageResource(R.mipmap.pause);
                }
                break ;
            case R.id.bt_play_seg1:
                playSeg(0,0) ;
                break ;
            case R.id.bt_play_seg2:
                playSeg(1,3) ;
                break ;

        }
    }

    private void playSeg(int seg, int times){
        if(isPlay){
            mMJet.pause() ;
        }
        mMJet.clearQueue() ;
        mMJet.queueJetSegment(seg, 0, times, 0, 0,mSSegmentID);
        mMJet.play() ;
        isPlay = true ;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMJet.clearQueue() ;
        mMJet.release();
        mMJet = null ;
    }
}
