package com.sqy.scancode.app;

import android.app.Application;
import android.content.Context;

public class CodeApp extends Application {
    /**
     * 标记当前串口状态(true:打开,false:关闭)
     **/
    public static boolean isFlagSerial = false;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    /**
     * 获取上下文
     * */
    public Context getContext() {
        return this.getApplicationContext();
    }
}