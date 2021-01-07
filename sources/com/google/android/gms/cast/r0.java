package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.c;

final /* synthetic */ class r0 implements Runnable {
    private final k0 a;
    private final c b;

    r0(k0 k0Var, c cVar) {
        this.a = k0Var;
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k0 k0Var = this.a;
        z.K(k0Var.a, this.b);
    }
}
