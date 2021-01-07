package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.kb;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class p8 implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ fa c;
    private final /* synthetic */ kb f;
    private final /* synthetic */ x7 n;

    p8(x7 x7Var, String str, String str2, fa faVar, kb kbVar) {
        this.n = x7Var;
        this.a = str;
        this.b = str2;
        this.c = faVar;
        this.f = kbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            s3 s3Var = this.n.d;
            if (s3Var == null) {
                this.n.l().E().c("Failed to get conditional properties; not connected to service", this.a, this.b);
                return;
            }
            ArrayList<Bundle> m0 = z9.m0(s3Var.D0(this.a, this.b, this.c));
            this.n.d0();
            this.n.f().R(this.f, m0);
        } catch (RemoteException e) {
            this.n.l().E().d("Failed to get conditional properties; remote exception", this.a, this.b, e);
        } finally {
            this.n.f().R(this.f, arrayList);
        }
    }
}
