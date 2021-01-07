package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class r5 implements Runnable {
    private final /* synthetic */ fa a;
    private final /* synthetic */ g5 b;

    r5(g5 g5Var, fa faVar) {
        this.b = g5Var;
        this.a = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g5.D3(this.b).d0();
        g5.D3(this.b).s(this.a);
    }
}
