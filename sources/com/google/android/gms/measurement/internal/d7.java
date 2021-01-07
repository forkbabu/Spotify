package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.kb;

final class d7 implements Runnable {
    private final /* synthetic */ kb a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ boolean f;
    private final /* synthetic */ AppMeasurementDynamiteService n;

    d7(AppMeasurementDynamiteService appMeasurementDynamiteService, kb kbVar, String str, String str2, boolean z) {
        this.n = appMeasurementDynamiteService;
        this.a = kbVar;
        this.b = str;
        this.c = str2;
        this.f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.n.a.O().H(this.a, this.b, this.c, this.f);
    }
}
