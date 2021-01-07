package com.google.android.gms.cast;

final /* synthetic */ class q0 implements Runnable {
    private final k0 a;
    private final int b;

    q0(k0 k0Var, int i) {
        this.a = k0Var;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k0 k0Var = this.a;
        int i = this.b;
        k0Var.a.m = 3;
        synchronized (k0Var.a.F) {
            for (q1 q1Var : k0Var.a.F) {
                q1Var.b(i);
            }
        }
    }
}
