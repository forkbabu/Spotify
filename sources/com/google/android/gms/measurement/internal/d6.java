package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.kb;

final class d6 implements Runnable {
    private final /* synthetic */ kb a;
    private final /* synthetic */ AppMeasurementDynamiteService b;

    d6(AppMeasurementDynamiteService appMeasurementDynamiteService, kb kbVar) {
        this.b = appMeasurementDynamiteService;
        this.a = kbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.O().E(this.a);
    }
}
