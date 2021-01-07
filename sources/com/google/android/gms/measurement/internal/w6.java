package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class w6 implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ i6 b;

    w6(i6 i6Var, AtomicReference atomicReference) {
        this.b = i6Var;
        this.a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            try {
                this.a.set(this.b.j().I(this.b.p().C()));
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
