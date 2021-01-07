package com.google.android.gms.measurement.internal;

final class u6 implements Runnable {
    private final /* synthetic */ h6 a;
    private final /* synthetic */ i6 b;

    u6(i6 i6Var, h6 h6Var) {
        this.b = i6Var;
        this.a = h6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.L(this.a);
    }
}
