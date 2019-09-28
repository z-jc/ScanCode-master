package com.sqy.scancode.config;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sqy.scancode.util.SharedPreferencesUtil;

import java.lang.reflect.Type;
import java.util.List;

/**
 * @author Administrator
 * @particulars
 * @time 2019\5\18 0018 14:00
 * @class describe
 */
public class AppConfig {

    /**
     * 保存数据
     *
     * @param list
     */
    public static void setData(List<String> list) {
        Gson gson = new Gson();
        String data = gson.toJson(list);
        SharedPreferencesUtil.setString("listData", data);
    }

    /**
     * 获取保存的数据
     *
     * @return
     */
    public static List<String> getData() {
        String data = SharedPreferencesUtil.getString("listData");
        Gson gson = new Gson();
        Type listType = new TypeToken<List<String>>() {
        }.getType();
        List<String> list = gson.fromJson(data, listType);
        return list;
    }
}
