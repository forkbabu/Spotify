package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.kb;

final class b8 implements Runnable {
    private final /* synthetic */ kb a;
    private final /* synthetic */ r b;
    private final /* synthetic */ String c;
    private final /* synthetic */ AppMeasurementDynamiteService f;

    b8(AppMeasurementDynamiteService appMeasurementDynamiteService, kb kbVar, r rVar, String str) {
        this.f = appMeasurementDynamiteService;
        this.a = kbVar;
        this.b = rVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.a.O().F(this.a, this.b, this.c);
    }
}
