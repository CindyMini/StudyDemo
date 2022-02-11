package com.mini.cindy.ciciapplication.db;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/**
 * @author : cici.chen
 * @date: 2022/1/13
 * description :
 */

public class SeedDatabaseWorker extends Worker {

    public SeedDatabaseWorker(
            @NonNull Context context,
            @NonNull WorkerParameters params) {
        super(context, params);
    }
    @NonNull
    @Override
    public Result doWork() {
        return null;
    }
}
