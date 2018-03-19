package com.bar.media;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bar.media.R;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import butterknife.ButterKnife;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;

import static com.bar.media.R.id.iv_play;

/**
 * author 岳明明
 * description
 * Created by yzm on 2017/7/31.
 */

public class MediaPlayerDemo extends Activity {

//    @BindView(R.id.tv_title)
    TextView title ;

//    @BindView(R.id.sb_play_progress)
    SeekBar mSeekBar ;

//    @BindView(iv_play)
    ImageView play;

//    @BindView(R.id.iv_next)
    ImageView next ;

//    @BindView(R.id.iv_before)
    ImageView before ;

//    @BindView(R.id.tv_current_time)
    TextView currentTime ;

//    @BindView(R.id.tv_total_time)
    TextView totalTime ;

    private MediaPlayer mPlayer ;
    private String[] names = new String[]{"漂洋过海来看你", "Samsara(轮回)","童话镇"} ;
    private String[] listA = new String[]{"pygh.mp3", "samsara.mp3", "thz.mp3"} ;
    //private int[] listR = new int[]{R.raw.thz, R.raw.pygh, R.raw.samsara} ;
    private int current = 0 ;

    private boolean hasResource = false ;

    private Flowable<Long> mFlowable;

    private boolean isTouch = false ;
    private Disposable mDisposable;
    private SimpleDateFormat mFormat;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.media_demo_layout);
        mSeekBar = (SeekBar)findViewById(R.id.sb_play_progress);
        title = (TextView)findViewById(R.id.tv_title);
        play = (ImageView)findViewById(iv_play);
        next = (ImageView)findViewById(R.id.iv_next);
        before = (ImageView)findViewById(R.id.iv_before);
        currentTime = (TextView)findViewById(R.id.tv_current_time);
        totalTime = (TextView)findViewById(R.id.tv_total_time);
        ButterKnife.bind(this) ;
        init() ;
    }

    /**
     * 从raw资源文件夹中播放
     * @param name
     */
    /*private void playSoundFromRaw(int name) {
        if (mPlayer.isPlaying()) {
            mPlayer.stop();
        }

        try {
            AssetFileDescriptor afd = getResources().openRawResourceFd(listR[current]);
            mPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            hasResource = true;
            mPlayer.prepare();
            mPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    /**
     * 从assets资源文件夹中播放
     * @param name
     */
    private void playSoundFromA(String name) {
        if (mPlayer.isPlaying()) {
            mPlayer.stop();
        }
        // 设置当前播放歌曲的名字
        title.setText(names[current]);
        mPlayer.reset();
        AssetFileDescriptor afd = getAssetFileDescriptor(name);
        try {
            mPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            hasResource = true;
            mPlayer.prepareAsync();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * 获取文件描述符
     * @param name
     * @return
     * @throws IOException
     */
    private AssetFileDescriptor getAssetFileDescriptor(String name){
        try {
            AssetFileDescriptor fd = getAssets().openFd(name) ;
            return fd ;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 初始化控件
     */
    private void init() {
        mFormat = new SimpleDateFormat("mm:ss");
        mPlayer = new MediaPlayer() ;
        mSeekBar.setOnSeekBarChangeListener(new MySeekBarChangeListener());
        mPlayer.setOnPreparedListener(new MyOnPrepareListener());
        mPlayer.setOnCompletionListener(new MyOnCompletionListener());
    }

//    @OnClick({R.id.iv_play, R.id.iv_next, R.id.iv_before})
    public void onClick(View v){
        switch (v.getId()){
            case iv_play:
                if(mPlayer.isPlaying()){
                    mPlayer.pause();
                    play.setImageResource(R.mipmap.play);
                }else{
                    if(hasResource){
                        mPlayer.start();
                    }else{
                        playSoundFromA(listA[current]);
                        //playSoundFromR(listR[current]);
                    }
                    play.setImageResource(R.mipmap.pause);
                }
                break ;
            case R.id.iv_next:
                playNext() ;
                break ;
            case R.id.iv_before:
                playBefore() ;
                break ;

        }
    }

    /**
     * 播放下一集
     */
    private void playNext(){
        if(!mPlayer.isPlaying()){
            play.setImageResource(R.mipmap.pause);
        }
        calibrateCurrent(true) ;
        playSoundFromA(listA[current]);
    }

    /**
     * 播放下一集
     */
    private void playBefore(){
        if(!mPlayer.isPlaying()){
            play.setImageResource(R.mipmap.pause);
        }
        calibrateCurrent(false);
        playSoundFromA(listA[current]);
    }

    /**
     * 矫正当前播放列表位置
     * @param isNext
     */
    private void calibrateCurrent(boolean isNext){
        if(isNext){
            current++ ;
        }else{
            current-- ;
        }
        if(current > (listA.length-1) || current < 0){
            current = 0 ;
        }
    }

    /**
     * 计算当前时间
     * @param orginalTime
     * @return
     */
    private String calcTime(int orginalTime){
        Date date = new Date(orginalTime) ;
        return mFormat.format(date) ;
    }

    private class MyOnPrepareListener implements MediaPlayer.OnPreparedListener{

        @Override
        public void onPrepared(MediaPlayer mp) {
            int total = mp.getDuration();
            //设置总进度
            totalTime.setText(calcTime(total));
            mSeekBar.setMax(total);
            mp.start();
            //开始更新进度
            updatePlayProgress() ;
            Toast mToast = Toast.makeText(MediaPlayerDemo.this, "播放第"+(current+1)+"首", Toast.LENGTH_SHORT) ;
            mToast.setGravity(Gravity.CENTER,0,0);
            mToast.show();
        }
    }

    private class MyOnCompletionListener implements MediaPlayer.OnCompletionListener{

        @Override
        public void onCompletion(MediaPlayer mp) {
            //取消更新
            cancelUpdateProgress();
            //进度条归0
            mSeekBar.setProgress(0);
            //设置时间归0
            currentTime.setText("00:00");
            totalTime.setText("00:00");
            current++ ;
            if(current>(listA.length-1)){
                current = 0 ;
            }
            playSoundFromA(listA[current]);
            //playSoundFromR(listR [current]);
        }
    }

    private class MySeekBarChangeListener implements SeekBar.OnSeekBarChangeListener{

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            if(isTouch){
                currentTime.setText(calcTime(progress));
            }
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            isTouch = true ;
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            //更新播放进度
            if(mPlayer.isPlaying()){
                mPlayer.seekTo(seekBar.getProgress());
            }
            isTouch = false ;
        }
    }

    /**
     * 更新进度条
     */
    private void updatePlayProgress(){
        mFlowable = Flowable.interval(10, TimeUnit.MILLISECONDS);
        //设置被压模式为，放弃
        mFlowable.onBackpressureDrop() ;
        mDisposable = mFlowable
                .observeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .filter(new Predicate<Long>() {
            @Override
            public boolean test(@NonNull Long aLong) throws Exception {
                return (!isTouch) && (mPlayer.isPlaying()) && (mSeekBar.getProgress()>=mSeekBar.getMax()?false:true);
            }
        }).map(new Function<Long, Integer>() {
                    @Override
                    public Integer apply(@NonNull Long aLong) throws Exception {
                        return mPlayer.getCurrentPosition() ;
                    }
                }).subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(@NonNull Integer integer) throws Exception {
                        //更新当前播放时间
                        currentTime.setText(calcTime(integer));
                        //更新进度
                        mSeekBar.setProgress(integer);
                    }
                }) ;
    }

    /**
     * 取消更新
     */
    private void cancelUpdateProgress(){
        if(mDisposable != null && !mDisposable.isDisposed()){
            mDisposable.dispose();
        }
        mFlowable = null ;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        cancelUpdateProgress() ;
        if(mPlayer != null){
            if(mPlayer.isPlaying()){
                mPlayer.stop();
                mPlayer.release();
            }
        }
    }
}
