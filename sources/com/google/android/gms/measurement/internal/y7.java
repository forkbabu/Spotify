package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class y7 implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ y9 b;
    private final /* synthetic */ fa c;
    private final /* synthetic */ x7 f;

    y7(x7 x7Var, boolean z, y9 y9Var, fa faVar) {
        this.f = x7Var;
        this.a = z;
        this.b = y9Var;
        this.c = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s3 s3Var = this.f.d;
        if (s3Var == null) {
            this.f.l().E().a("Discarding data. Failed to set user property");
            return;
        }
        this.f.K(s3Var, this.a ? null : this.b, this.c);
        this.f.d0();
    }
}
