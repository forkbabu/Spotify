package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class m8 implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String f;
    private final /* synthetic */ fa n;
    private final /* synthetic */ x7 o;

    m8(x7 x7Var, AtomicReference atomicReference, String str, String str2, String str3, fa faVar) {
        this.o = x7Var;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.f = str3;
        this.n = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            try {
                s3 s3Var = this.o.d;
                if (s3Var == null) {
                    this.o.l().E().d("(legacy) Failed to get conditional properties; not connected to service", a4.w(this.b), this.c, this.f);
                    this.a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.b)) {
                    this.a.set(s3Var.D0(this.c, this.f, this.n));
                } else {
                    this.a.set(s3Var.B0(this.b, this.c, this.f));
                }
                this.o.d0();
                this.a.notify();
            } catch (RemoteException e) {
                this.o.l().E().d("(legacy) Failed to get conditional properties; remote exception", a4.w(this.b), this.c, e);
                this.a.set(Collections.emptyList());
            } finally {
                this.a.notify();
            }
        }
    }
}
