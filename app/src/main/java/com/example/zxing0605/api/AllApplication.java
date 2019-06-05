package com.example.zxing0605.api;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/*
 *@Auther:苏格拉没有底
 *@Date: 2019/6/5
 *@Time:20:12
 *@Description:作用:
 * */public class AllApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ZXingLibrary.initDisplayOpinion(this);
    }
}
