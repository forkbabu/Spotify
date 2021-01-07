package com.spotify.mobius;

class k<M, E, F> extends j<M, E> {
    private final i<M, E> b;
    private final h<M> c;
    private M d;

    k(i<M, E> iVar, h<M> hVar, M m) {
        this.b = iVar;
        this.c = hVar;
        this.d = m;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobius.j
    public String a() {
        return "created";
    }

    @Override // com.spotify.mobius.j
    public void d() {
        this.c.dispose();
        ((b0) this.b).h(this.d);
    }

    @Override // com.spotify.mobius.j
    public M f() {
        return this.d;
    }

    @Override // com.spotify.mobius.j
    public void g(M m) {
        this.d = m;
    }

    @Override // com.spotify.mobius.j
    public void h() {
        ((b0) this.b).i(this.c, this.d);
    }
}
