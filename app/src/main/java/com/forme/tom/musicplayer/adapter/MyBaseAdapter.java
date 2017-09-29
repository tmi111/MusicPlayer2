package com.forme.tom.musicplayer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.forme.tom.musicplayer.R;
import com.forme.tom.musicplayer.bean.Music;

import java.util.List;
import java.util.Objects;

/**
 * Created by Tom on 17-9-29.
 */
public abstract class MyBaseAdapter extends BaseAdapter {
    List<Object> mMusicList;
    Context mContext;

    public MyBaseAdapter(Context context) {

        mContext = context;
    }

    public MyBaseAdapter(List<Object> musicList, Context context) {
        mMusicList = musicList;
        mContext = context;
    }

    @Override

    public int getCount() {
        return mMusicList.size();
    }
    @Override
   public  Object getItem(int i) {
        return mMusicList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewHolder holeder = null;
        if (view == null) {
            findViewByID(view,holeder,i);
            view.setTag(holeder);
        }else {
            holeder= (ViewHolder) view.getTag();
        }
            setViewHolder(i,holeder);

        return view;
    }

    protected abstract void setViewHolder(int positon,ViewHolder holder);

    protected abstract void findViewByID(View view,ViewHolder holder,int position);

    class ViewHolder{

    }

}
