package com.spotify.mobius.rx2;

import com.spotify.mobius.q;
import io.reactivex.functions.f;
import io.reactivex.t;
import io.reactivex.u;

/* access modifiers changed from: package-private */
public class k implements u<E> {
    final /* synthetic */ q a;

    class a implements da2<E> {
        final /* synthetic */ t a;

        a(k kVar, t tVar) {
            this.a = tVar;
        }

        @Override // defpackage.da2
        public void accept(E e) {
            this.a.onNext(e);
        }
    }

    class b implements f {
        final /* synthetic */ w92 a;

        b(k kVar, w92 w92) {
            this.a = w92;
        }

        @Override // io.reactivex.functions.f
        public void cancel() {
            this.a.dispose();
        }
    }

    k(q qVar) {
        this.a = qVar;
    }

    @Override // io.reactivex.u
    public void subscribe(t<E> tVar) {
        tVar.e(new b(this, this.a.a(new a(this, tVar))));
    }
}
