package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* access modifiers changed from: package-private */
public final class e8 implements Runnable {
    private final /* synthetic */ p7 a;
    private final /* synthetic */ x7 b;

    e8(x7 x7Var, p7 p7Var) {
        this.b = x7Var;
        this.a = p7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s3 s3Var = this.b.d;
        if (s3Var == null) {
            this.b.l().E().a("Failed to send current screen to service");
            return;
        }
        try {
            p7 p7Var = this.a;
            if (p7Var == null) {
                s3Var.z0(0, null, null, this.b.i().getPackageName());
            } else {
                s3Var.z0(p7Var.c, p7Var.a, p7Var.b, this.b.i().getPackageName());
            }
            this.b.d0();
        } catch (RemoteException e) {
            this.b.l().E().b("Failed to send current screen to the service", e);
        }
    }
}
