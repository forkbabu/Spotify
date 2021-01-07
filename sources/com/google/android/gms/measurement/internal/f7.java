package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class f7 implements Runnable {
    private final /* synthetic */ e a;
    private final /* synthetic */ long b;
    private final /* synthetic */ int c;
    private final /* synthetic */ long f;
    private final /* synthetic */ boolean n;
    private final /* synthetic */ i6 o;

    f7(i6 i6Var, e eVar, long j, int i, long j2, boolean z) {
        this.o = i6Var;
        this.a = eVar;
        this.b = j;
        this.c = i;
        this.f = j2;
        this.n = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.o.I(this.a);
        this.o.F(this.b, false);
        i6.O(this.o, this.a, this.c, this.f, true, this.n);
    }
}
