package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.kb;

final class ca implements Runnable {
    private final /* synthetic */ kb a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ AppMeasurementDynamiteService f;

    ca(AppMeasurementDynamiteService appMeasurementDynamiteService, kb kbVar, String str, String str2) {
        this.f = appMeasurementDynamiteService;
        this.a = kbVar;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.a.O().G(this.a, this.b, this.c);
    }
}
