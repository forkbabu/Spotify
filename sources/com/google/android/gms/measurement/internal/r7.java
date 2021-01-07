package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* access modifiers changed from: package-private */
public final class r7 implements Runnable {
    private final /* synthetic */ Bundle a;
    private final /* synthetic */ p7 b;
    private final /* synthetic */ p7 c;
    private final /* synthetic */ long f;
    private final /* synthetic */ o7 n;

    r7(o7 o7Var, Bundle bundle, p7 p7Var, p7 p7Var2, long j) {
        this.n = o7Var;
        this.a = bundle;
        this.b = p7Var;
        this.c = p7Var2;
        this.f = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o7.J(this.n, this.a, this.b, this.c, this.f);
    }
}
