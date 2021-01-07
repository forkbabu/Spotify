package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* access modifiers changed from: package-private */
public final /* synthetic */ class z8 implements Runnable {
    private final w8 a;
    private final int b;
    private final a4 c;
    private final Intent f;

    z8(w8 w8Var, int i, a4 a4Var, Intent intent) {
        this.a = w8Var;
        this.b = i;
        this.c = a4Var;
        this.f = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b, this.c, this.f);
    }
}
