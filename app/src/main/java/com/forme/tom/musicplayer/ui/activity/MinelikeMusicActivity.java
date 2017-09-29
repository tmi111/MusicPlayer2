package com.forme.tom.musicplayer.ui.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.forme.tom.musicplayer.R;

/**
 * Created by Tom on 17-9-29.
 */
public class MinelikeMusicActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("1111", "like_onCreate");
    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected void initTitle() {
        textTitle.setText(getIntent().getStringExtra("titleName"));
        mLeftImage.setVisibility(View.INVISIBLE);
    }

    @Override
    public int getContentViewId() {
        return R.layout.activity_grid_content;
    }
}
