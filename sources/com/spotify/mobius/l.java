package com.spotify.mobius;

/* access modifiers changed from: package-private */
public class l<M, E, F> extends j<M, E> {
    private final i<M, E> b;
    private M c;

    l(i<M, E> iVar, M m) {
        this.b = iVar;
        this.c = m;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobius.j
    public String a() {
        return "init";
    }

    @Override // com.spotify.mobius.j
    public void c(g<M, E> gVar) {
        i<M, E> iVar = this.b;
        M m = this.c;
        b0 b0Var = (b0) iVar;
        b0Var.getClass();
        b0Var.g(new n(gVar).t(new c0(b0Var)), m);
    }

    @Override // com.spotify.mobius.j
    public M f() {
        return this.c;
    }

    @Override // com.spotify.mobius.j
    public void g(M m) {
        this.c = m;
    }
}
