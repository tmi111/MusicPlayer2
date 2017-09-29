package com.forme.tom.musicplayer.adapter;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.Image;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.forme.tom.musicplayer.R;
import com.forme.tom.musicplayer.bean.Music;

import java.util.List;


/**
 * Created by tom on 17-9-28.
 */
public class HomeGVAdapter extends BaseAdapter {
    List<String> mMusicList;

    public HomeGVAdapter(List<String> musicList, Context context) {
        mMusicList = musicList;
        mContext = context;
    }

    Context mContext;

    @Override
    public int getCount() {
        return mMusicList.size();
    }

    @Override
    public String getItem(int i) {
        return mMusicList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolderGV holder = null;
        if (view == null) {
            holder = new ViewHolderGV();
            view = View.inflate(mContext, R.layout.home_grid_view_item, null);
            holder.mContent = (TextView) view.findViewById(R.id.content_text);
            holder.mContentImage = (ImageView) view.findViewById(R.id.content_image);
            holder.mHowManyMusic = (TextView) view.findViewById(R.id.content_music);
            view.setTag(holder);
        } else {
            holder = (ViewHolderGV) view.getTag();
        }
        holder.mContent.setText(getItem(i));
        holder.mHowManyMusic.setText("0首歌曲");
        holder.mContentImage.setImageDrawable(mContext.getDrawable(R.mipmap.ic_launcher));
        return view;
    }


    class ViewHolderGV {
        TextView mContent;
        TextView mHowManyMusic;
        ImageView mContentImage;
    }
}
