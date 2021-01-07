package com.spotify.mobius;

class n<I, O> implements g<I, O> {
    private final g<I, O> a;

    /* access modifiers changed from: package-private */
    public class a implements h<I> {
        final /* synthetic */ o a;
        final /* synthetic */ w92 b;

        a(n nVar, o oVar, w92 w92) {
            this.a = oVar;
            this.b = w92;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(I i) {
            this.a.accept(i);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.b.dispose();
        }
    }

    n(g<I, O> gVar) {
        this.a = gVar;
    }

    @Override // com.spotify.mobius.g
    public h<I> t(da2<O> da2) {
        o c = o.c(da2);
        o b = o.b(this.a.t(c));
        return new a(this, b, v92.b(b, c));
    }
}
