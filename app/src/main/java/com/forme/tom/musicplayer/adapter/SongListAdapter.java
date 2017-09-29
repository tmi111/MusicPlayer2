package com.forme.tom.musicplayer.adapter;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.forme.tom.musicplayer.R;
import com.forme.tom.musicplayer.bean.Music;
import com.forme.tom.musicplayer.bean.MusicBean;

import java.util.List;

/**
 * Created by Tom on 17-9-29.
 */
public class SongListAdapter extends BaseAdapter {
    List<MusicBean> mMusicList;
    Context mContext;

    public SongListAdapter(List<MusicBean> musicList, Context context) {
        mMusicList = musicList;
        mContext = context;
    }
    @Override
    public int getCount() {
        return mMusicList.size();
    }

    @Override
    public MusicBean getItem(int i) {
        return mMusicList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (view == null) {
            holder = new ViewHolder();
            view = View.inflate(mContext, R.layout.song_list_item, null);
            holder.musicName = (TextView) view.findViewById(R.id.music_name);
            holder.single = (TextView) view.findViewById(R.id.singer);
            holder.mImageView = (ImageView) view.findViewById(R.id.music_style);
            holder.option = (ImageView) view.findViewById(R.id.song_list_option);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        holder.single.setText(getItem(i).getSingle());
        holder.musicName.setText(getItem(i).getMusicName());
        holder.mImageView.setImageDrawable(mContext.getDrawable(R.mipmap.ic_launcher));
        holder.option.setImageDrawable(mContext.getDrawable(R.mipmap.option));
        return view;
    }
    class ViewHolder{
        TextView musicName;
        TextView single;
        ImageView mImageView;
        ImageView option;
    }
}
