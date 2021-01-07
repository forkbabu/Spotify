package com.spotify.mobius;

import com.spotify.mobius.MobiusLoop;

/* access modifiers changed from: package-private */
public class m<M, E, F> extends j<M, E> {
    private final i<M, E> b;
    private final h<M> c;
    private final MobiusLoop<M, E, F> d;
    private final M e;

    class a implements da2<M> {
        a() {
        }

        @Override // defpackage.da2
        public void accept(M m) {
            ((b0) m.this.b).j(m);
        }
    }

    m(i<M, E> iVar, h<M> hVar, MobiusLoop.h<M, E, F> hVar2, M m, t<M, F> tVar) {
        this.b = iVar;
        this.c = hVar;
        if (tVar != null) {
            s<M, F> a2 = tVar.a(m);
            this.d = hVar2.a(a2.d(), a2.a());
            this.e = a2.d();
            return;
        }
        this.d = hVar2.g(m);
        this.e = m;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobius.j
    public String a() {
        return "running";
    }

    @Override // com.spotify.mobius.j
    public boolean b() {
        return true;
    }

    @Override // com.spotify.mobius.j
    public void e(E e2) {
        this.d.h(e2);
    }

    @Override // com.spotify.mobius.j
    public M f() {
        M i = this.d.i();
        return i != null ? i : this.e;
    }

    @Override // com.spotify.mobius.j
    public void i() {
        this.d.dispose();
        M i = this.d.i();
        ((b0) this.b).g(this.c, i);
    }

    @Override // com.spotify.mobius.j
    public void j(M m) {
        this.c.accept(m);
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.d.j(new a());
    }
}
