package com.forme.tom.musicplayer.ui.activity;

import android.app.Activity;
import android.app.Application;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.forme.tom.musicplayer.R;


/**
 * Created by ludaxu on 17-9-26.
 */
public abstract class BaseActivity extends Activity {

    Toolbar tootbarTitle;
    TextView textTitle;
    ImageView mLeftImage;
    ImageView mRightImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("1111", "base_oncreate");
        setContentView(getContentViewId());

        findView();
        initTitle();
        initEvent();
    }

    protected abstract void initEvent();


    /*标题进行初始化*/
    protected abstract void initTitle();

    /*发现这个界面上的控件*/
    protected void findView(){

        /*每个activity都有toolbar*/
       tootbarTitle = (Toolbar) findViewById(R.id.toolbar);
        textTitle = (TextView) tootbarTitle.findViewById(R.id.toolbar_text_title);
        mLeftImage = (ImageView) tootbarTitle.findViewById(R.id.titlle_left_image);
        mRightImage = (ImageView) tootbarTitle.findViewById(R.id.titlle_right_image);

    }


    public abstract int getContentViewId();
}
