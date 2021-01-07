package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class a7 implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ i6 b;

    a7(i6 i6Var, AtomicReference atomicReference) {
        this.b = i6Var;
        this.a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            try {
                this.a.set(Long.valueOf(this.b.j().n(this.b.p().C(), t.M)));
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
