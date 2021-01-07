package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class i9 implements Runnable {
    long a;
    long b;
    final /* synthetic */ f9 c;

    i9(f9 f9Var, long j, long j2) {
        this.c = f9Var;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b.k().y(new h9(this));
    }
}
