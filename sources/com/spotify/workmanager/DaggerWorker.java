package com.spotify.workmanager;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public abstract class DaggerWorker extends Worker {
    public DaggerWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a p() {
        a.a(this);
        return new ListenableWorker.a.c();
    }
}
