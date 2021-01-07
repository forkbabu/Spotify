package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final /* synthetic */ class j5 implements Runnable {
    private final g5 a;
    private final fa b;
    private final Bundle c;

    j5(g5 g5Var, fa faVar, Bundle bundle) {
        this.a = g5Var;
        this.b = faVar;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.G3(this.b, this.c);
    }
}
