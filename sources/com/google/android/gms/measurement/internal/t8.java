package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

final class t8 implements Runnable {
    private final /* synthetic */ ComponentName a;
    private final /* synthetic */ r8 b;

    t8(r8 r8Var, ComponentName componentName) {
        this.b = r8Var;
        this.a = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x7.M(this.b.c, this.a);
    }
}
