package com.spotify.mobius.rx2;

import com.spotify.mobius.q;
import io.reactivex.functions.g;
import io.reactivex.s;

/* access modifiers changed from: package-private */
public class j implements q<E> {
    final /* synthetic */ s a;

    class a implements g<E> {
        final /* synthetic */ da2 a;

        a(j jVar, da2 da2) {
            this.a = da2;
        }

        @Override // io.reactivex.functions.g
        public void accept(E e) {
            this.a.accept(e);
        }
    }

    class b implements g<Throwable> {
        b(j jVar) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            io.reactivex.plugins.a.g(th);
        }
    }

    class c implements w92 {
        final /* synthetic */ io.reactivex.disposables.b a;

        c(j jVar, io.reactivex.disposables.b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.w92
        public void dispose() {
            this.a.dispose();
        }
    }

    j(s sVar) {
        this.a = sVar;
    }

    @Override // com.spotify.mobius.q
    public w92 a(da2<E> da2) {
        return new c(this, this.a.subscribe(new a(this, da2), new b(this)));
    }
}
