package com.google.android.gms.measurement.internal;

final class k5 implements Runnable {
    private final /* synthetic */ oa a;
    private final /* synthetic */ g5 b;

    k5(g5 g5Var, oa oaVar) {
        this.b = g5Var;
        this.a = oaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g5.D3(this.b).d0();
        if (this.a.c.I1() == null) {
            g5.D3(this.b).N(this.a);
        } else {
            g5.D3(this.b).t(this.a);
        }
    }
}
