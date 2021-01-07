package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class k8 implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ r b;
    private final /* synthetic */ fa c;
    private final /* synthetic */ String f;
    private final /* synthetic */ x7 n;

    k8(x7 x7Var, boolean z, boolean z2, r rVar, fa faVar, String str) {
        this.n = x7Var;
        this.a = z2;
        this.b = rVar;
        this.c = faVar;
        this.f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s3 s3Var = this.n.d;
        if (s3Var == null) {
            this.n.l().E().a("Discarding data. Failed to send event to service");
            return;
        }
        this.n.K(s3Var, this.a ? null : this.b, this.c);
        this.n.d0();
    }
}
