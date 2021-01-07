package com.spotify.mobius.rx2;

import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;

/* access modifiers changed from: package-private */
public class t implements w<F, E> {
    final /* synthetic */ l a;
    final /* synthetic */ y b;

    class a implements l<F, v<E>> {
        a() {
        }

        @Override // io.reactivex.functions.l
        public Object apply(Object obj) {
            s c0 = s.c0(new s(this, obj));
            y yVar = t.this.b;
            return yVar == null ? c0 : c0.I0(yVar);
        }
    }

    t(l lVar, y yVar) {
        this.a = lVar;
        this.b = yVar;
    }

    @Override // io.reactivex.w
    public v<E> apply(s<F> sVar) {
        return sVar.W(new a(), false, Integer.MAX_VALUE);
    }
}
