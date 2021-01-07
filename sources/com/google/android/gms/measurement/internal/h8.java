package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* access modifiers changed from: package-private */
public final class h8 implements Runnable {
    private final /* synthetic */ Bundle a;
    private final /* synthetic */ fa b;
    private final /* synthetic */ x7 c;

    h8(x7 x7Var, Bundle bundle, fa faVar) {
        this.c = x7Var;
        this.a = bundle;
        this.b = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s3 s3Var = this.c.d;
        if (s3Var == null) {
            this.c.l().E().a("Failed to send default event parameters to service");
            return;
        }
        try {
            s3Var.x1(this.a, this.b);
        } catch (RemoteException e) {
            this.c.l().E().b("Failed to send default event parameters to service", e);
        }
    }
}
