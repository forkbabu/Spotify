package com.spotify.mobius;

import com.spotify.mobius.MobiusLoop;

/* access modifiers changed from: package-private */
public class b0<M, E, F> implements MobiusLoop.g<M, E>, i<M, E> {
    private final MobiusLoop.h<M, E, F> a;
    private final M b;
    private final t<M, F> c;
    private final ia2 d;
    private j<M, E> e;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        final /* synthetic */ Object a;

        a(Object obj) {
            this.a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.e(b0.this, this.a);
        }
    }

    b0(MobiusLoop.h<M, E, F> hVar, M m, t<M, F> tVar, ia2 ia2) {
        hVar.getClass();
        this.a = hVar;
        m.getClass();
        this.b = m;
        this.c = tVar;
        ia2.getClass();
        this.d = ia2;
        synchronized (this) {
            this.e = new l(this, m);
        }
    }

    static void e(b0 b0Var, Object obj) {
        b0Var.e.j(obj);
    }

    static void f(b0 b0Var, Object obj) {
        b0Var.e.e(obj);
    }

    @Override // com.spotify.mobius.MobiusLoop.g
    public synchronized void a(M m) {
        m.getClass();
        this.e.g(m);
    }

    @Override // com.spotify.mobius.MobiusLoop.g
    public synchronized M b() {
        return this.e.f();
    }

    @Override // com.spotify.mobius.MobiusLoop.g
    public synchronized void c(g<M, E> gVar) {
        j<M, E> jVar = this.e;
        gVar.getClass();
        jVar.c(gVar);
    }

    @Override // com.spotify.mobius.MobiusLoop.g
    public synchronized void d() {
        this.e.d();
    }

    public synchronized void g(h<M> hVar, M m) {
        if (m == null) {
            m = this.b;
        }
        this.e = new k(this, hVar, m);
    }

    public synchronized void h(M m) {
        this.e = new l(this, m);
    }

    public synchronized void i(h<M> hVar, M m) {
        m mVar = new m(this, hVar, this.a, m, this.c);
        this.e = mVar;
        mVar.l();
    }

    @Override // com.spotify.mobius.MobiusLoop.g
    public synchronized boolean isRunning() {
        return this.e.b();
    }

    public void j(M m) {
        this.d.a(new a(m));
    }

    @Override // com.spotify.mobius.MobiusLoop.g
    public synchronized void start() {
        this.e.h();
    }

    @Override // com.spotify.mobius.MobiusLoop.g
    public synchronized void stop() {
        this.e.i();
    }
}
