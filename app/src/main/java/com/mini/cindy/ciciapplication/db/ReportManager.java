package com.mini.cindy.ciciapplication.db;

import android.content.Context;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : cici.chen
 * @date : 2022/1/11
 * description : 上传管理类
 */
public class ReportManager {
    private volatile static ReportManager instance;

    private long  mWarning = 2;
    private long  mError   = 3;

    private Map<String,String> map;

    private ReportManager(Context mContext){
        map  = new HashMap<>();
    }

    public static ReportManager getInstance(Context mContext){
        if (instance == null ){
            synchronized (ReportManager.class){
                if (instance == null){
                    instance = new ReportManager(mContext);
                }
            }
        }
        return  instance;
    }
    AppDatabase appDatabase;
    public void read(Context mContext){
         appDatabase = AppDatabase.getInstance(mContext);
        for (int i = 0; i < 100; i++) {
            readFile(mContext,  appDatabase );
        }
    }

    public void select(Context mContext){
        appDatabase = AppDatabase.getInstance(mContext);
        for (int i = 0; i < 10; i++) {
            ReportBean reportBean =  appDatabase.reportDao().load();
            if (null !=reportBean){
                String gosn = reportBean.getAppName();
                String id= reportBean.getId() +"";
                Log.e("返回",gosn +":" +id );
                appDatabase.reportDao().delete(reportBean);
            }



        }
    }


    public  void readFile(Context mContext,AppDatabase a){

        //读取数据库的对象上传
        ReportBean repostBean = new ReportBean();
        repostBean.setMessage("inner/fdfds/rererere") ;
        repostBean.setMessageType(mError);
        repostBean.setSendIp("102.455.3998");
        repostBean.setThrowable("");
        repostBean.setOperator("cici-3422445");
        repostBean.setEorrTime(System.currentTimeMillis()+"");
        repostBean.setAppName("xfjy-android");
        repostBean.setRequestParameter("");
        appDatabase.reportDao().insertAll(repostBean);



    }







}
