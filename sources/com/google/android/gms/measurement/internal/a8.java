package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* access modifiers changed from: package-private */
public final class a8 implements Runnable {
    private final /* synthetic */ fa a;
    private final /* synthetic */ x7 b;

    a8(x7 x7Var, fa faVar) {
        this.b = x7Var;
        this.a = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s3 s3Var = this.b.d;
        if (s3Var == null) {
            this.b.l().E().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            s3Var.E2(this.a);
        } catch (RemoteException e) {
            this.b.l().E().b("Failed to reset data on the service: remote exception", e);
        }
        this.b.d0();
    }
}
