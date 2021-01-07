package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class n8 implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ oa b;
    private final /* synthetic */ fa c;
    private final /* synthetic */ oa f;
    private final /* synthetic */ x7 n;

    n8(x7 x7Var, boolean z, oa oaVar, fa faVar, oa oaVar2) {
        this.n = x7Var;
        this.a = z;
        this.b = oaVar;
        this.c = faVar;
        this.f = oaVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s3 s3Var = this.n.d;
        if (s3Var == null) {
            this.n.l().E().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        this.n.K(s3Var, this.a ? null : this.b, this.c);
        this.n.d0();
    }
}
