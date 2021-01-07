package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class z6 implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ i6 b;

    z6(i6 i6Var, AtomicReference atomicReference) {
        this.b = i6Var;
        this.a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            try {
                this.a.set(Integer.valueOf(this.b.j().t(this.b.p().C(), t.N)));
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
