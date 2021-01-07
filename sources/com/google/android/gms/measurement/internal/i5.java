package com.google.android.gms.measurement.internal;

import com.google.android.exoplayer2.util.g;

final class i5 implements Runnable {
    private final /* synthetic */ fa a;
    private final /* synthetic */ g5 b;

    i5(g5 g5Var, fa faVar) {
        this.b = g5Var;
        this.a = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g5.D3(this.b).d0();
        r9 D3 = g5.D3(this.b);
        fa faVar = this.a;
        D3.k().b();
        D3.b0();
        g.i(faVar.a);
        D3.P(faVar);
    }
}
