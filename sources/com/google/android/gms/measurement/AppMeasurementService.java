package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.a9;
import com.google.android.gms.measurement.internal.w8;

public final class AppMeasurementService extends Service implements a9 {
    private w8<AppMeasurementService> a;

    private final w8<AppMeasurementService> c() {
        if (this.a == null) {
            this.a = new w8<>(this);
        }
        return this.a;
    }

    @Override // com.google.android.gms.measurement.internal.a9
    public final void a(Intent intent) {
        b6.a(intent);
    }

    @Override // com.google.android.gms.measurement.internal.a9
    public final void b(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.a9
    public final boolean g(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return c().b(intent);
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

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        c().a(intent, i2);
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        c().h(intent);
        return true;
    }
}
