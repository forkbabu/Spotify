package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.m0;

final /* synthetic */ class s0 implements Runnable {
    private final k0 a;
    private final m0 b;

    s0(k0 k0Var, m0 m0Var) {
        this.a = k0Var;
        this.b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k0 k0Var = this.a;
        z.L(k0Var.a, this.b);
    }
}
