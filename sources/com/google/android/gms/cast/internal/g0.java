package com.google.android.gms.cast.internal;

final class g0 implements Runnable {
    private final /* synthetic */ d0 a;
    private final /* synthetic */ m0 b;

    g0(d0 d0Var, m0 m0Var) {
        this.a = d0Var;
        this.b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0.f0(this.a, this.b);
    }
}
