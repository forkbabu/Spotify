package com.spotify.music.features.podcast.entity.loadedpage.data;

import defpackage.o27;
import io.reactivex.functions.h;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.y;
import java.util.Map;

public final class i implements h {
    private final o27 a;
    private final pnc b;
    private final txc c;
    private final y d;

    static final class a<T1, T2, T3, R> implements h<qyd, onc, Map<String, ? extends String>, b> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.h
        public b a(qyd qyd, onc onc, Map<String, ? extends String> map) {
            qyd qyd2 = qyd;
            onc onc2 = onc;
            Map<String, ? extends String> map2 = map;
            kotlin.jvm.internal.h.e(qyd2, "showEntity");
            kotlin.jvm.internal.h.e(onc2, "podcastPlayerState");
            kotlin.jvm.internal.h.e(map2, "productState");
            return new b(qyd2, onc2, uxc.c(map2));
        }
    }

    public i(o27 o27, pnc pnc, txc txc, y yVar) {
        kotlin.jvm.internal.h.e(o27, "showDataSource");
        kotlin.jvm.internal.h.e(pnc, "playstateDataSource");
        kotlin.jvm.internal.h.e(txc, "productState");
        kotlin.jvm.internal.h.e(yVar, "computationScheduler");
        this.a = o27;
        this.b = pnc;
        this.c = txc;
        this.d = yVar;
    }

    @Override // com.spotify.music.features.podcast.entity.loadedpage.data.h
    public s<b> a(o27.a aVar) {
        kotlin.jvm.internal.h.e(aVar, "request");
        s<qyd> a2 = this.a.a(aVar);
        g<onc> a3 = this.b.a(this.d);
        a3.getClass();
        s<b> m = s.m(a2, new v(a3), this.c.b(), a.a);
        kotlin.jvm.internal.h.d(m, "Observable.combineLatest…)\n            }\n        )");
        return m;
    }
}
