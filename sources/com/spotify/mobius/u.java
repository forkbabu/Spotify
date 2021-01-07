package com.spotify.mobius;

import com.spotify.mobius.MobiusLoop;

class u<M, F> implements t<M, F> {
    private final t<M, F> a;
    private final MobiusLoop.i<M, ?, F> b;

    u(t<M, F> tVar, MobiusLoop.i<M, ?, F> iVar) {
        tVar.getClass();
        this.a = tVar;
        iVar.getClass();
        this.b = iVar;
    }

    @Override // com.spotify.mobius.t
    public s<M, F> a(M m) {
        this.b.f(m);
        try {
            s<M, F> a2 = this.a.a(m);
            this.b.c(m, a2);
            return a2;
        } catch (Exception e) {
            this.b.d(m, e);
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new RuntimeException(e);
        }
    }
}
