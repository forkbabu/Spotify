package com.google.android.gms.measurement.internal;

final class o6 implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ i6 b;

    o6(i6 i6Var, long j) {
        this.b = i6Var;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.h().q.b(this.a);
        this.b.l().L().b("Session timeout duration set", Long.valueOf(this.a));
    }
}
