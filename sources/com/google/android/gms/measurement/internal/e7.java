package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class e7 implements Runnable {
    private final /* synthetic */ e a;
    private final /* synthetic */ int b;
    private final /* synthetic */ long c;
    private final /* synthetic */ boolean f;
    private final /* synthetic */ i6 n;

    e7(i6 i6Var, e eVar, int i, long j, boolean z) {
        this.n = i6Var;
        this.a = eVar;
        this.b = i;
        this.c = j;
        this.f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.n.I(this.a);
        i6.O(this.n, this.a, this.b, this.c, false, this.f);
    }
}
