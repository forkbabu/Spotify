package com.google.android.gms.measurement.internal;

final class p6 implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ i6 b;

    p6(i6 i6Var, long j) {
        this.b = i6Var;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.h().p.b(this.a);
        this.b.l().L().b("Minimum session duration set", Long.valueOf(this.a));
    }
}
