package com.mini.cindy.ciciapplication.work;

import android.content.Context;
import android.util.Log;

import com.mini.cindy.ciciapplication.db.ReportManager;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/**
 * @author : cici.chen
 * @date: 2022/1/17
 * description :
 */
public class MyWorker extends Worker {
    private Context mContext;

    public MyWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
        this.mContext = context;

    }

    @NonNull
    @Override
    public Result doWork() {
        Log.e("cici","打印调用情况");
        ReportManager.getInstance(mContext).select(mContext);
        //RoomExplorer.show(this, AppDatabase::class.java, "bugly.db")

        return Result.success();
    }
}
