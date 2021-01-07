package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.kb;
import com.google.android.gms.internal.measurement.q7;

/* access modifiers changed from: package-private */
public final class c8 implements Runnable {
    private final /* synthetic */ fa a;
    private final /* synthetic */ kb b;
    private final /* synthetic */ x7 c;

    c8(x7 x7Var, fa faVar, kb kbVar) {
        this.c = x7Var;
        this.a = faVar;
        this.b = kbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!q7.b() || !this.c.j().r(t.P0) || this.c.h().z().o()) {
                s3 s3Var = this.c.d;
                if (s3Var == null) {
                    this.c.l().E().a("Failed to get app instance id");
                    this.c.f().Q(this.b, null);
                    return;
                }
                String p2 = s3Var.p2(this.a);
                if (p2 != null) {
                    this.c.o().S(p2);
                    this.c.h().l.b(p2);
                }
                this.c.d0();
                this.c.f().Q(this.b, p2);
                return;
            }
            this.c.l().J().a("Analytics storage consent denied; will not get app instance id");
            this.c.o().S(null);
            this.c.h().l.b(null);
        } catch (RemoteException e) {
            this.c.l().E().b("Failed to get app instance id", e);
        } finally {
            this.c.f().Q(this.b, null);
        }
    }
}
