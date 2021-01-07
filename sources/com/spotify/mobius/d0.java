package com.spotify.mobius;

/* access modifiers changed from: package-private */
public class d0<M, E, F> {
    private final g0<M, E, F> a;
    private M b;

    private d0(g0<M, E, F> g0Var, M m) {
        g0Var.getClass();
        this.a = g0Var;
        m.getClass();
        this.b = m;
    }

    public static <M, E, F> d0<M, E, F> a(g0<M, E, F> g0Var, M m) {
        return new d0<>(g0Var, m);
    }

    /* access modifiers changed from: package-private */
    public synchronized e0<M, F> b(E e) {
        e0<M, F> a2;
        g0<M, E, F> g0Var = this.a;
        M m = this.b;
        e.getClass();
        a2 = g0Var.a(m, e);
        M m2 = this.b;
        a2.getClass();
        m2.getClass();
        if (a2.c()) {
            m2 = a2.e();
        }
        this.b = m2;
        return a2;
    }
}
