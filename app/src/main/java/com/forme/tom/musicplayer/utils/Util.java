package com.forme.tom.musicplayer.utils;

import android.content.Context;

/**
 * Created by Tom on 17-9-29.
 */
public class Util {

    public static int getStatusBarHeight(Context mContext) {
        int result = 0;
        int resourceId = mContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = mContext.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }
}
