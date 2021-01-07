package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* access modifiers changed from: package-private */
public final class r6 implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ long c;
    private final /* synthetic */ Bundle f;
    private final /* synthetic */ boolean n;
    private final /* synthetic */ boolean o;
    private final /* synthetic */ boolean p;
    private final /* synthetic */ i6 q;

    r6(i6 i6Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.q = i6Var;
        this.a = str;
        this.b = str2;
        this.c = j;
        this.f = bundle;
        this.n = z;
        this.o = z2;
        this.p = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.U(this.a, this.b, this.c, this.f, this.n, this.o, this.p, null);
    }
}
