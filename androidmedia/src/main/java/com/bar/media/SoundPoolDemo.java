package com.bar.media;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.bar.media.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class SoundPoolDemo extends Activity {

    @BindView(R.id.textView)
    TextView mTextView;
    @BindView(R.id.textView4)
    TextView mTextView4;
    @BindView(R.id.bt_sdp_cat)
    Button mBtSdpCat;
    @BindView(R.id.bt_sdp_autopuase)
    Button mBtSdpAutopuase;
    @BindView(R.id.bt_sdp_brdacat)
    Button mBtSdpBrdacat;
    @BindView(R.id.bt_sdp_autoresume)
    Button mBtSdpAutoresume;
    @BindView(R.id.bt_sdp_stopall)
    Button mBtSdpStopall;
    @BindView(R.id.bt_sdp_topzho)
    Button mBtSdpTopzho;

    //资源列表
    private Map<String, Integer> map ;

    private List<Integer> streamId ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soundpool_demo_layout);
        ButterKnife.bind(this);
        init() ;
    }

    private void init() {
        map = new HashMap<>() ;
        map.put("cat", R.raw.cat) ;
        map.put("acj", R.raw.acj) ;
        SoundPoolUtil.getInstance().loadR(this, map);
    }

    private List<Integer> zh ;

    @OnClick({R.id.bt_sdp_cat, R.id.bt_sdp_autopuase, R.id.bt_sdp_brdacat, R.id.bt_sdp_autoresume, R.id.bt_sdp_stopall, R.id.bt_sdp_topzho})
    public void onClick(View v){
        switch (v.getId()){
            case R.id.bt_sdp_cat:
                //播放一次猫叫
                SoundPoolUtil.getInstance().play("cat", 1) ;
                break ;
            case R.id.bt_sdp_brdacat:
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        List<String> lists = new ArrayList<>() ;
                        lists.add("acj");
                        lists.add("cat");
                        //播放6次猫叫和鸟叫(组合播放)
                        zh = SoundPoolUtil.getInstance().play(lists, 6) ;
                    }
                }).start();
                break ;
            case R.id.bt_sdp_autopuase:
                //暂停所有播放
                SoundPoolUtil.getInstance().pauseAll();
                break ;
            case R.id.bt_sdp_autoresume:
                //恢复所有暂停音效
                SoundPoolUtil.getInstance().resumeAll();
                break ;
            case R.id.bt_sdp_stopall:
                SoundPoolUtil.getInstance().stopAll();
                break ;
            case R.id.bt_sdp_topzho:
                if(zh != null){
                    SoundPoolUtil.getInstance().stop(zh.get(0));
                }
                break ;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SoundPoolUtil.getInstance().stopAll();
    }
}
