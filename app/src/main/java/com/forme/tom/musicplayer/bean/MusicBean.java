package com.forme.tom.musicplayer.bean;

/**
 * Created by Tom on 17-9-29.
 */
public class MusicBean {
    private String musicName;
    private String single;
    private String musincStyle;

    public MusicBean(String musicName, String single, String musincStyle) {
        this.musicName = musicName;
        this.single = single;
        this.musincStyle = musincStyle;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public String getMusincStyle() {
        return musincStyle;
    }

    public void setMusincStyle(String musincStyle) {
        this.musincStyle = musincStyle;
    }
}
