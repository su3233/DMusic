package com.d.music.module.media;

import com.d.music.module.greendao.music.base.MusicModel;

import java.util.List;

/**
 * CusMusic
 * Created by D on 2017/5/2.
 */
public class CusMusic {
    public List<MusicModel> models;

    public CusMusic(List<? extends MusicModel> models) {
        this.models = (List<MusicModel>) models;
    }
}
