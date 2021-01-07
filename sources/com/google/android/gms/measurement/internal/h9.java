package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final /* synthetic */ class h9 implements Runnable {
    private final i9 a;

    h9(i9 i9Var) {
        this.a = i9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i9 i9Var = this.a;
        f9 f9Var = i9Var.c;
        long j = i9Var.a;
        long j2 = i9Var.b;
        f9Var.b.b();
        f9Var.b.l().L().a("Application going to the background");
        boolean z = true;
        if (f9Var.b.j().r(t.x0)) {
            f9Var.b.h().w.a(true);
        }
        Bundle bundle = new Bundle();
        if (!f9Var.b.j().E().booleanValue()) {
            f9Var.b.e.f();
            if (f9Var.b.j().r(t.o0)) {
                bundle.putLong("_et", f9Var.b.e.g(j2));
                o7.M(f9Var.b.s().C(true), bundle, true);
            } else {
                z = false;
            }
            f9Var.b.D(false, z, j2);
        }
        f9Var.b.o().T("auto", "_ab", j, bundle);
    }
}
