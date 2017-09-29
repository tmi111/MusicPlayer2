package com.forme.tom.musicplayer.ui.activity;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.RelativeLayout;

import com.forme.tom.musicplayer.R;
import com.forme.tom.musicplayer.adapter.HomeGVAdapter;
import com.forme.tom.musicplayer.utils.Util;

import java.util.ArrayList;


public class MainActivity extends BaseActivity {

    private static final String TAG = "111111";
    private GridView mHomeGV;
    private String[] mStringArray;

    @Override
    public int getContentViewId() {
        return R.layout.activity_main;
    }


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void findView() {
        super.findView();
        mHomeGV = (GridView) findViewById(R.id.home_grid);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("1111", "main_oncreate");

    }

    @Override
    protected void initEvent() {
        //ArrayList<Music> musicFile = ScanMusic.getMusicFile(this);
        mStringArray = getResources().getStringArray(R.array.home_gv_array);

        ArrayList<String> contentGV = new ArrayList<>();
        for(String string : mStringArray){
            contentGV.add(string);
        }
        mHomeGV.setAdapter(new HomeGVAdapter(contentGV,this));
        initGrideView();
        mHomeGV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = null;
                switch (i) {
                    case 0:
                        Log.d("11111111", "onItemClick ");
                        intent = new Intent(MainActivity.this, LocalMusicActivity.class);
                        intent.putExtra("titleName", mStringArray[i]);
                        Log.d("1111", "00000");
                        startActivity(intent);
                        break;
                    case 1:

                        intent = new Intent(MainActivity.this, MinelikeMusicActivity.class);
                        intent.putExtra("titleName", mStringArray[i]);
                        Log.d("1111111", "111111");
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, MineSongListActivity.class);
                        intent.putExtra("titleName", mStringArray[i]);
                        Log.d("1111", "222222");
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(MainActivity.this, LatelyPlayerActivity.class);
                        intent.putExtra("titleName", mStringArray[i]);
                        Log.d("1111", "333333");
                        startActivity(intent);
                        break;
                }
            }
        });
    }

    private void initGrideView() {
        /*new GridView.LayoutParams();*/
    }

    @Override
    protected void initTitle() {
       textTitle.setText(R.string.home);
        int statusBarHeight = Util.getStatusBarHeight(this);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(tootbarTitle.getLayoutParams());
        lp.setMargins(0, statusBarHeight, 0, 0);
        tootbarTitle.setLayoutParams(lp);
    }
}

