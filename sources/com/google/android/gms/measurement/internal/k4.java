package com.google.android.gms.measurement.internal;

final class k4 implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ l4 b;

    k4(l4 l4Var, boolean z) {
        this.b = l4Var;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.B();
    }
}
