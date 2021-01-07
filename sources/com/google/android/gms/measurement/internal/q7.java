package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class q7 implements Runnable {
    private final /* synthetic */ p7 a;
    private final /* synthetic */ p7 b;
    private final /* synthetic */ long c;
    private final /* synthetic */ boolean f;
    private final /* synthetic */ o7 n;

    q7(o7 o7Var, p7 p7Var, p7 p7Var2, long j, boolean z) {
        this.n = o7Var;
        this.a = p7Var;
        this.b = p7Var2;
        this.c = j;
        this.f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.n.N(this.a, this.b, this.c, this.f, null);
    }
}
