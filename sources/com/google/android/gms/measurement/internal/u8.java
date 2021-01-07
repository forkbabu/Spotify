package com.google.android.gms.measurement.internal;

final class u8 implements Runnable {
    private final /* synthetic */ r8 a;

    u8(r8 r8Var) {
        this.a = r8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c.d = null;
        this.a.c.f0();
    }
}
