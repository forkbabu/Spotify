package com.google.android.gms.measurement.internal;

import com.google.android.exoplayer2.util.g;
import com.google.android.gms.internal.measurement.q7;

final class q5 implements Runnable {
    private final /* synthetic */ fa a;
    private final /* synthetic */ g5 b;

    q5(g5 g5Var, fa faVar) {
        this.b = g5Var;
        this.a = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g5.D3(this.b).d0();
        r9 D3 = g5.D3(this.b);
        fa faVar = this.a;
        if (q7.b() && D3.G().r(t.Q0)) {
            D3.k().b();
            D3.b0();
            g.i(faVar.a);
            e b2 = e.b(faVar.F);
            e a2 = D3.a(faVar.a);
            D3.x(faVar.a, b2);
            if (b2.g(a2)) {
                D3.s(faVar);
            }
        }
    }
}
