package com.forme.tom.musicplayer.ui.activity;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.forme.tom.musicplayer.R;
import com.forme.tom.musicplayer.adapter.SongListAdapter;
import com.forme.tom.musicplayer.bean.Music;
import com.forme.tom.musicplayer.bean.MusicBean;

import java.util.ArrayList;

/**
 * Created by Tom on 17-9-29.
 */
public class LocalMusicActivity extends  BaseActivity {

    private ListView mSongList;
    private LinearLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("1111", "local_oncreate");
        super.onCreate(savedInstanceState);


    }

    @Override
    protected void findView() {
        super.findView();
        mTabLayout = (LinearLayout) findViewById(R.id.tab_layout);
        mSongList = (ListView) findViewById(R.id.song_list);
        mTabLayout.setVisibility(View.VISIBLE);
        LinearLayout back = (LinearLayout) findViewById(R.id.activity_back);

        int colors[] = { R.color.BGStartColor , R.color.BGEndColor};
        GradientDrawable g = new GradientDrawable(GradientDrawable.Orientation.TL_BR, colors);
       // back.setBackground(g);
    }

    @Override
    protected void initEvent() {
        ArrayList<MusicBean> music = new ArrayList<>();
        MusicBean musicBean1 = new MusicBean("以父之名", "周杰伦", "hq");
        MusicBean musicBean2 = new MusicBean("以父之名", "周杰伦", "hq");
        MusicBean musicBean3 = new MusicBean("以父之名", "周杰伦", "hq");
        music.add(musicBean1);
        music.add(musicBean2);
        music.add(musicBean3);
        mSongList.setAdapter(new SongListAdapter(music,this));
    }

    @Override
    protected void initTitle() {
        textTitle.setText(getIntent().getStringExtra("titleName"));
    }

    @Override
    public int getContentViewId() {
        return R.layout.activity_grid_content;
    }
}
