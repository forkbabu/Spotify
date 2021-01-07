package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class n6 implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ i6 b;

    n6(i6 i6Var, AtomicReference atomicReference) {
        this.b = i6Var;
        this.a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            try {
                AtomicReference atomicReference = this.a;
                qa j = this.b.j();
                String C = this.b.p().C();
                j.getClass();
                atomicReference.set(Boolean.valueOf(j.x(C, t.K)));
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
