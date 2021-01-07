package com.spotify.mobius.rx2;

import io.reactivex.e;
import io.reactivex.functions.g;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;

/* access modifiers changed from: package-private */
public class r implements w<F, E> {
    final /* synthetic */ g a;
    final /* synthetic */ y b;

    class a implements l<F, e> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // io.reactivex.functions.l
        public e apply(Object obj) {
            io.reactivex.a u = io.reactivex.a.u(new q(this, obj));
            y yVar = r.this.b;
            return yVar == null ? u : u.G(yVar);
        }
    }

    r(g gVar, y yVar) {
        this.a = gVar;
        this.b = yVar;
    }

    @Override // io.reactivex.w
    public v<E> apply(s<F> sVar) {
        return sVar.Y(new a()).N();
    }
}
