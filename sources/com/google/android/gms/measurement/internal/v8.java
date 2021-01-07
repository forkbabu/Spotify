package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

final class v8 implements Runnable {
    private final /* synthetic */ r8 a;

    v8(r8 r8Var) {
        this.a = r8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x7.M(this.a.c, new ComponentName(this.a.c.i(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
