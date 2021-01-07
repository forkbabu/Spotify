package com.spotify.mobius;

import com.spotify.mobius.MobiusLoop;

/* access modifiers changed from: package-private */
public class v<M, E, F> implements g0<M, E, F> {
    private final g0<M, E, F> a;
    private final MobiusLoop.i<M, E, F> b;

    v(g0<M, E, F> g0Var, MobiusLoop.i<M, E, F> iVar) {
        g0Var.getClass();
        this.a = g0Var;
        iVar.getClass();
        this.b = iVar;
    }

    @Override // com.spotify.mobius.g0
    public e0<M, F> a(M m, E e) {
        this.b.e(m, e);
        try {
            e0<M, F> a2 = this.a.a(m, e);
            this.b.a(m, e, a2);
            return a2;
        } catch (Exception e2) {
            this.b.b(m, e, e2);
            if (e2 instanceof RuntimeException) {
                throw ((RuntimeException) e2);
            }
            throw new RuntimeException(e2);
        }
    }
}
