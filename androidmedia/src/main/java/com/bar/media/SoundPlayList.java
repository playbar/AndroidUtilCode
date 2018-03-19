package com.bar.media;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import java.util.Arrays;
import java.util.List;


public class SoundPlayList extends ListActivity implements AdapterView.OnItemClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,getData()) ;
        setListAdapter(adapter) ;
        getListView().setOnItemClickListener(this);
    }

    private List getData() {
        List<String> datas = Arrays.asList("MediaPlayer", "SoundPool", "AudioTrack", "AsyncPlayer", "JetPlayer", "Ringtone");
        return datas;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent() ;
        System.out.println(position);
        switch (position){
            case 0:
                intent.setClass(this, MediaPlayerDemo.class);
                break ;
            case 1:
                intent.setClass(this, SoundPoolDemo.class);
                break ;
            case 2:
                intent.setClass(this, AudioTrackDemo.class);
                break ;
            case 3:
                intent.setClass(this, AsyncPlayerDemo.class);
                break ;
            case 4:
                intent.setClass(this, JetPlayerDemo.class);
                break ;
            case 5:
                intent.setClass(this, RingtoneDemo.class);
                break ;
        }
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SoundPoolUtil.getInstance().release();
    }
}
