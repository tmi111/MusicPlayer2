package com.forme.tom.musicplayer.ui.activity;

import android.util.Log;

import com.forme.tom.musicplayer.R;

/**
 * Created by Tom on 17-9-29.
 */
public class LatelyPlayerActivity extends BaseActivity {
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("1111", "lately_oncreate");
    }

    @Override
    protected void initEvent() {

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
