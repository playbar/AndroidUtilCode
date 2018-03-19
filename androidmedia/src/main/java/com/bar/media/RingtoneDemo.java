package com.bar.media;

import android.app.Activity;
import android.database.Cursor;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.bar.media.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class RingtoneDemo extends Activity {

    @BindView(R.id.bt_mr_ringtone)
    Button mr ;

    @BindView(R.id.bt_sj_ringtone)
    Button sj ;

    @BindView(R.id.bt_set_sj_to_mr)
    Button sjTom ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ringtone_demo_layout);
        ButterKnife.bind(this) ;
    }

    /**
     * 播放来电铃声的默认音乐
     */
    private void playRingtoneDefault(){
        RingtoneManager manager = new RingtoneManager(this) ;
        Uri uri = manager.getDefaultUri(RingtoneManager.TYPE_RINGTONE) ;
        mRingtone1 = RingtoneManager.getRingtone(this,uri) ;
        mRingtone1.play();
    }


    private Ringtone mRingtone1 ;
    private Ringtone mRingtone2 ;

    /**
     * 随机播放一个Ringtone(有可能是提示音、铃声等)
     */
    private void ShufflePlayback(){
        RingtoneManager manager = new RingtoneManager(this) ;
        Cursor cursor = manager.getCursor();
        int count = cursor.getCount() ;
        int position = (int)(Math.random()*count) ;
        mRingtone2 = manager.getRingtone(position) ;
        mRingtone2.play();
    }

    /**
     * 设置铃声列表的随机铃声为来电铃声
     */
    private void setShuffleToDefault(){
        RingtoneManager manager = new RingtoneManager(this) ;
        Cursor cursor = manager.getCursor();
        int count = cursor.getCount() ;
        int position = (int)(Math.random()*count) ;
        //将获取的随机位置的铃声设置为默认铃声
        RingtoneManager.setActualDefaultRingtoneUri(this, RingtoneManager.TYPE_RINGTONE, manager.getRingtoneUri(position)) ;
        Toast.makeText(this, "铃声设置成功",Toast.LENGTH_SHORT).show();
    }

    @OnClick({R.id.bt_mr_ringtone, R.id.bt_sj_ringtone,R.id.bt_set_sj_to_mr})
    public void onClick(View v){
        switch (v.getId()){
            case R.id.bt_mr_ringtone:
                playRingtoneDefault() ;
                break ;
            case R.id.bt_sj_ringtone:
                ShufflePlayback() ;
                break ;
            case R.id.bt_set_sj_to_mr:
                setShuffleToDefault() ;
                break ;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mRingtone1.isPlaying()){
            mRingtone1.stop();
        }

        if(mRingtone2.isPlaying()){
            mRingtone2.stop();
        }
    }
}
