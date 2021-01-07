package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.kb;

final class c9 implements Runnable {
    private final /* synthetic */ kb a;
    private final /* synthetic */ AppMeasurementDynamiteService b;

    c9(AppMeasurementDynamiteService appMeasurementDynamiteService, kb kbVar) {
        this.b = appMeasurementDynamiteService;
        this.a = kbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.F().S(this.a, this.b.a.S());
    }
}
