package com.google.android.gms.cast;

final /* synthetic */ class p0 implements Runnable {
    private final k0 a;
    private final int b;

    p0(k0 k0Var, int i) {
        this.a = k0Var;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k0 k0Var = this.a;
        k0Var.a.E.b(this.b);
    }
}
