package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.q7;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class d8 implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ fa b;
    private final /* synthetic */ x7 c;

    d8(x7 x7Var, AtomicReference atomicReference, fa faVar) {
        this.c = x7Var;
        this.a = atomicReference;
        this.b = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            try {
                if (!q7.b() || !this.c.j().r(t.P0) || this.c.h().z().o()) {
                    s3 s3Var = this.c.d;
                    if (s3Var == null) {
                        this.c.l().E().a("Failed to get app instance id");
                        this.a.notify();
                        return;
                    }
                    this.a.set(s3Var.p2(this.b));
                    String str = (String) this.a.get();
                    if (str != null) {
                        this.c.o().S(str);
                        this.c.h().l.b(str);
                    }
                    this.c.d0();
                    this.a.notify();
                    return;
                }
                this.c.l().J().a("Analytics storage consent denied; will not get app instance id");
                this.c.o().S(null);
                this.c.h().l.b(null);
                this.a.set(null);
            } catch (RemoteException e) {
                this.c.l().E().b("Failed to get app instance id", e);
            } finally {
                this.a.notify();
            }
        }
    }
}
