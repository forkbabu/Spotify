package com.spotify.mobius.rx2;

import io.reactivex.e;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;

/* access modifiers changed from: package-private */
public class p implements w<F, E> {
    final /* synthetic */ y a;
    final /* synthetic */ io.reactivex.functions.a b;

    class a implements l<F, e> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // io.reactivex.functions.l
        public e apply(Object obj) {
            p pVar = p.this;
            if (pVar.a == null) {
                return io.reactivex.a.u(pVar.b);
            }
            return io.reactivex.a.u(pVar.b).G(p.this.a);
        }
    }

    p(y yVar, io.reactivex.functions.a aVar) {
        this.a = yVar;
        this.b = aVar;
    }

    @Override // io.reactivex.w
    public v<E> apply(s<F> sVar) {
        return sVar.Y(new a()).N();
    }
}
