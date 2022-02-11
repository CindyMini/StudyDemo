package com.mini.cindy.ciciapplication.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

/**
 * @author : cici.chen
 * @date: 2022/1/12
 * description : 数据库类
 * https://developer.android.google.cn/training/data-storage/room
 */
@Database(entities = {ReportBean.class}, version = 1,exportSchema=false)
public abstract class AppDatabase extends RoomDatabase {
    private volatile static AppDatabase instance;
    public abstract ReportDao reportDao();

    public static AppDatabase getInstance(Context mContext){
        if (instance == null ){
            synchronized (AppDatabase.class){
                if (instance == null){
                    instance =  buildDatabase(mContext);
                }
            }
        }
        return  instance;
    }

    private  static AppDatabase  buildDatabase(Context context)  {
        return Room.databaseBuilder(context,AppDatabase.class, "bugly.db").allowMainThreadQueries().build();
    }





}
