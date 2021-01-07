package com.google.android.gms.cast.internal;

final class h0 implements Runnable {
    private final /* synthetic */ d0 a;
    private final /* synthetic */ int b;

    h0(d0 d0Var, int i) {
        this.a = d0Var;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.N.b(this.b);
    }
}
