package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* access modifiers changed from: package-private */
public final class f8 implements Runnable {
    private final /* synthetic */ fa a;
    private final /* synthetic */ x7 b;

    f8(x7 x7Var, fa faVar) {
        this.b = x7Var;
        this.a = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s3 s3Var = this.b.d;
        if (s3Var == null) {
            this.b.l().E().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            s3Var.J0(this.a);
            this.b.t().J();
            this.b.K(s3Var, null, this.a);
            this.b.d0();
        } catch (RemoteException e) {
            this.b.l().E().b("Failed to send app launch to the service", e);
        }
    }
}
