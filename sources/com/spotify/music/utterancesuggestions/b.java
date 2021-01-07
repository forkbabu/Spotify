package com.spotify.music.utterancesuggestions;

import defpackage.n4b;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.operators.maybe.c;
import kotlin.jvm.internal.h;

public final class b<T extends n4b> implements n4b {
    private final T a;
    private final g b;

    static final class a<T, R> implements l<b91, tpf<? extends b91>> {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public tpf<? extends b91> apply(b91 b91) {
            b91 b912 = b91;
            h.e(b912, "original");
            io.reactivex.l<f> a2 = this.a.b.a();
            a aVar = a.a;
            a2.getClass();
            c cVar = new c(a2, aVar);
            this.a.getClass();
            return cVar.l(new c(new RxUtteranceSuggetionSearch$appendUtteranceTo$1(b912))).e(b912).u();
        }
    }

    public b(T t, g gVar) {
        h.e(t, "searchHistory");
        h.e(gVar, "utteranceProvider");
        this.a = t;
        this.b = gVar;
    }

    @Override // defpackage.n4b
    public g<b91> c() {
        g<R> F = this.a.c().F(new a(this));
        h.d(F, "searchHistory\n        .o…  .toFlowable()\n        }");
        return F;
    }
}
