package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class d9 implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ e9 b;

    d9(e9 e9Var, long j) {
        this.b = e9Var;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e9.C(this.b, this.a);
    }
}
