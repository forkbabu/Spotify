package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class s7 implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ o7 b;

    s7(o7 o7Var, long j) {
        this.b = o7Var;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.n().v(this.a);
        this.b.e = null;
    }
}
