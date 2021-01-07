package com.google.android.gms.cast;

import com.google.android.gms.tasks.g;

final /* synthetic */ class o0 implements Runnable {
    private final k0 a;
    private final int b;

    o0(k0 k0Var, int i) {
        this.a = k0Var;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k0 k0Var = this.a;
        int i = this.b;
        z.i0(k0Var.a);
        k0Var.a.m = 1;
        synchronized (k0Var.a.F) {
            for (q1 q1Var : k0Var.a.F) {
                q1Var.d(i);
            }
        }
        k0Var.a.j0();
        z zVar = k0Var.a;
        g unused = zVar.y(zVar.k);
    }
}
