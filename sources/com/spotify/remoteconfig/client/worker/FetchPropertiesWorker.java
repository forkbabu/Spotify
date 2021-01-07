package com.spotify.remoteconfig.client.worker;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import com.spotify.remoteconfig.client.model.resolve.FetchType;
import dagger.android.h;
import io.reactivex.a;

public class FetchPropertiesWorker extends Worker {
    public FetchPropertiesWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a p() {
        d e = e();
        FetchType fetchType = FetchType.UNKNOWN;
        int c = e.c("FETCH_TYPE", fetchType.d());
        if (c != 0) {
            if (c == 1) {
                fetchType = FetchType.BACKGROUND_SYNC;
            } else if (c == 2) {
                fetchType = FetchType.BLOCKING;
            } else if (c != 3) {
                fetchType = FetchType.UNRECOGNIZED;
            } else {
                fetchType = FetchType.DELAYED;
            }
        }
        try {
            if (a() instanceof h) {
                ((h) a()).C().a(this);
            }
        } catch (IllegalArgumentException unused) {
        }
        e0e a = a() instanceof b ? ((b) a()).a() : null;
        if (a == null) {
            trf.c(new NullPointerException("RemoteConfiguration not provided"), "FetchPropertiesWorker can't access a RemoteConfig instance.", new Object[0]);
            return new ListenableWorker.a.C0051a();
        }
        a f = a.f(fetchType);
        io.reactivex.internal.observers.d dVar = new io.reactivex.internal.observers.d();
        f.subscribe(dVar);
        Throwable c2 = dVar.c();
        if (c2 == null) {
            trf.d("Configuration successfully fetched.", new Object[0]);
            return new ListenableWorker.a.c();
        }
        trf.c(c2, "Cannot fetch configuration. Retrying soon.", new Object[0]);
        return new ListenableWorker.a.b();
    }
}
