package com.google.android.gms.measurement.internal;

final class l5 implements Runnable {
    private final /* synthetic */ oa a;
    private final /* synthetic */ fa b;
    private final /* synthetic */ g5 c;

    l5(g5 g5Var, oa oaVar, fa faVar) {
        this.c = g5Var;
        this.a = oaVar;
        this.b = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g5.D3(this.c).d0();
        if (this.a.c.I1() == null) {
            g5.D3(this.c).O(this.a, this.b);
        } else {
            g5.D3(this.c).u(this.a, this.b);
        }
    }
}
