package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class t5 implements Runnable {
    private final /* synthetic */ r a;
    private final /* synthetic */ fa b;
    private final /* synthetic */ g5 c;

    t5(g5 g5Var, r rVar, fa faVar) {
        this.c = g5Var;
        this.a = rVar;
        this.b = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r K3 = this.c.K3(this.a, this.b);
        g5.D3(this.c).d0();
        g5.D3(this.c).m(K3, this.b);
    }
}
