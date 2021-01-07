package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class h5 implements Runnable {
    private final /* synthetic */ j6 a;
    private final /* synthetic */ f5 b;

    h5(f5 f5Var, j6 j6Var) {
        this.b = f5Var;
        this.a = j6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f5.g(this.b, this.a);
        this.b.f(this.a.g);
    }
}
