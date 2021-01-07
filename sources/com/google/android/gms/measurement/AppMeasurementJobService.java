package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.a9;
import com.google.android.gms.measurement.internal.w8;

public final class AppMeasurementJobService extends JobService implements a9 {
    private w8<AppMeasurementJobService> a;

    private final w8<AppMeasurementJobService> c() {
        if (this.a == null) {
            this.a = new w8<>(this);
        }
        return this.a;
    }

    @Override // com.google.android.gms.measurement.internal.a9
    public final void a(Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.a9
    public final void b(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // com.google.android.gms.measurement.internal.a9
    public final boolean g(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        c().c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        c().g();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        c().j(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        c().f(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        c().h(intent);
        return true;
    }
}
