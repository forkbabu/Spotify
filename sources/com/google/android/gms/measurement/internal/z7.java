package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.kb;

/* access modifiers changed from: package-private */
public final class z7 implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ fa f;
    private final /* synthetic */ kb n;
    private final /* synthetic */ x7 o;

    z7(x7 x7Var, String str, String str2, boolean z, fa faVar, kb kbVar) {
        this.o = x7Var;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.f = faVar;
        this.n = kbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = new Bundle();
        try {
            s3 s3Var = this.o.d;
            if (s3Var == null) {
                this.o.l().E().c("Failed to get user properties; not connected to service", this.a, this.b);
                return;
            }
            Bundle D = z9.D(s3Var.O2(this.a, this.b, this.c, this.f));
            this.o.d0();
            this.o.f().P(this.n, D);
        } catch (RemoteException e) {
            this.o.l().E().c("Failed to get user properties; remote exception", this.a, e);
        } finally {
            this.o.f().P(this.n, bundle);
        }
    }
}
