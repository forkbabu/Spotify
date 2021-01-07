package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class b9 implements Runnable {
    private final /* synthetic */ r9 a;
    private final /* synthetic */ Runnable b;

    b9(r9 r9Var, Runnable runnable) {
        this.a = r9Var;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d0();
        this.a.v(this.b);
        this.a.c0();
    }
}
