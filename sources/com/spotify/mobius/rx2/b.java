package com.spotify.mobius.rx2;

import com.spotify.mobius.g;
import com.spotify.mobius.h;

/* access modifiers changed from: package-private */
public class b<I, O> implements g<I, O> {
    private final g<I, O> a;

    class a implements h<I> {
        final /* synthetic */ c a;
        final /* synthetic */ w92 b;

        a(b bVar, c cVar, w92 w92) {
            this.a = cVar;
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

    b(g<I, O> gVar) {
        this.a = gVar;
    }

    @Override // com.spotify.mobius.g
    public h<I> t(da2<O> da2) {
        c c = c.c(da2);
        c b = c.b(this.a.t(c));
        return new a(this, b, v92.b(b, c));
    }
}
