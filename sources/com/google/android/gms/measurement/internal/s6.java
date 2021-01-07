package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class s6 implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ i6 b;

    s6(i6 i6Var, long j) {
        this.b = i6Var;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.F(this.a, true);
        this.b.r().Q(new AtomicReference<>());
    }
}
