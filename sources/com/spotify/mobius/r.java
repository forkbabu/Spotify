package com.spotify.mobius;

class r<M, E> implements g<M, E> {
    private final q<E> a;

    class a implements h<M> {
        final /* synthetic */ w92 a;

        a(r rVar, w92 w92) {
            this.a = w92;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public synchronized void accept(M m) {
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public synchronized void dispose() {
            this.a.dispose();
        }
    }

    private r(q<E> qVar) {
        this.a = qVar;
    }

    public static <M, E> g<M, E> a(q<E> qVar) {
        return new r(qVar);
    }

    @Override // com.spotify.mobius.g
    public h<M> t(da2<E> da2) {
        return new a(this, this.a.a(da2));
    }
}
