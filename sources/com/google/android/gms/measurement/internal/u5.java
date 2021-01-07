package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class u5 implements Runnable {
    private final /* synthetic */ y9 a;
    private final /* synthetic */ fa b;
    private final /* synthetic */ g5 c;

    u5(g5 g5Var, y9 y9Var, fa faVar) {
        this.c = g5Var;
        this.a = y9Var;
        this.b = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g5.D3(this.c).d0();
        if (this.a.I1() == null) {
            g5.D3(this.c).L(this.a, this.b);
        } else {
            g5.D3(this.c).r(this.a, this.b);
        }
    }
}
