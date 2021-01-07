package com.spotify.mobius;

/* access modifiers changed from: package-private */
public class p<M, E, F> {
    private final d0<M, E, F> a;
    private final da2<F> b;
    private final da2<M> c;

    /* access modifiers changed from: package-private */
    public static class a<M, E, F> {
        private final d0<M, E, F> a;

        a(d0<M, E, F> d0Var) {
            this.a = d0Var;
        }

        public p<M, E, F> a(da2<F> da2, da2<M> da22) {
            return new p<>(this.a, da2, da22);
        }
    }

    p(d0<M, E, F> d0Var, da2<F> da2, da2<M> da22) {
        d0Var.getClass();
        this.a = d0Var;
        this.b = da2;
        this.c = da22;
    }

    static void a(p pVar, Object obj) {
        pVar.c.accept(obj);
    }

    /* access modifiers changed from: package-private */
    public synchronized void b(E e) {
        e0<M, F> b2 = this.a.b(e);
        if (b2.c()) {
            a(this, b2.e());
        }
        for (F f : b2.b()) {
            this.b.accept(f);
        }
    }
}
