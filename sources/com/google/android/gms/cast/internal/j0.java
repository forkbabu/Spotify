package com.google.android.gms.cast.internal;

final class j0 implements Runnable {
    private final /* synthetic */ d0 a;
    private final /* synthetic */ c b;

    j0(d0 d0Var, c cVar) {
        this.a = d0Var;
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0.e0(this.a, this.b);
    }
}
