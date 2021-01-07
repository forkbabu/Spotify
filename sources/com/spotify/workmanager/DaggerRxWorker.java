package com.spotify.workmanager;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import io.reactivex.z;

public abstract class DaggerRxWorker extends RxWorker {
    public DaggerRxWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.RxWorker
    public z<ListenableWorker.a> p() {
        a.a(this);
        return z.q(new UnsupportedOperationException("Create your own Single in your subclass"));
    }
}
