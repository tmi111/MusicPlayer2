package com.forme.tom.musicplayer.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.forme.tom.musicplayer.R;

public class MineSongListActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("1111", "mine_oncreate");
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected void initTitle() {
        textTitle.setText(getIntent().getStringExtra("titleName"));
        mLeftImage.setVisibility(View.INVISIBLE);
        mRightImage.setVisibility(View.INVISIBLE);
    }

    @Override
    public int getContentViewId() {
        return R.layout.activity_grid_content;
    }
}
