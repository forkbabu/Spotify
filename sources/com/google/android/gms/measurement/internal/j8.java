package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.kb;

/* access modifiers changed from: package-private */
public final class j8 implements Runnable {
    private final /* synthetic */ r a;
    private final /* synthetic */ String b;
    private final /* synthetic */ kb c;
    private final /* synthetic */ x7 f;

    j8(x7 x7Var, r rVar, String str, kb kbVar) {
        this.f = x7Var;
        this.a = rVar;
        this.b = str;
        this.c = kbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            s3 s3Var = this.f.d;
            if (s3Var == null) {
                this.f.l().E().a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] c1 = s3Var.c1(this.a, this.b);
            this.f.d0();
            this.f.f().T(this.c, c1);
        } catch (RemoteException e) {
            this.f.l().E().b("Failed to send event to the service to bundle", e);
        } finally {
            this.f.f().T(this.c, null);
        }
    }
}
