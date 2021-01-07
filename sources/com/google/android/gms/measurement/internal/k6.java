package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k6 implements Runnable {
    private final i6 a;

    k6(i6 i6Var) {
        this.a = i6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i6 i6Var = this.a;
        i6Var.b();
        if (i6Var.h().x.b()) {
            i6Var.l().L().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a2 = i6Var.h().y.a();
        i6Var.h().y.b(1 + a2);
        if (a2 >= 5) {
            i6Var.l().H().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            i6Var.h().x.a(true);
            return;
        }
        i6Var.a.u();
    }
}
