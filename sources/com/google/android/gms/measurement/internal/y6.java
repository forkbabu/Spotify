package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class y6 implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String f;
    private final /* synthetic */ i6 n;

    y6(i6 i6Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.n = i6Var;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.f = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.n.a.O().R(this.a, this.b, this.c, this.f);
    }
}
