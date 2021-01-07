package com.google.android.gms.cast;

final /* synthetic */ class m0 implements Runnable {
    private final k0 a;
    private final int b;

    m0(k0 k0Var, int i) {
        this.a = k0Var;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k0 k0Var = this.a;
        int i = this.b;
        if (i == 0) {
            k0Var.a.m = 2;
            k0Var.a.n = true;
            k0Var.a.o = true;
            synchronized (k0Var.a.F) {
                for (q1 q1Var : k0Var.a.F) {
                    q1Var.a();
                }
            }
            return;
        }
        k0Var.a.m = 1;
        synchronized (k0Var.a.F) {
            for (q1 q1Var2 : k0Var.a.F) {
                q1Var2.c(i);
            }
        }
        k0Var.a.j0();
    }
}
