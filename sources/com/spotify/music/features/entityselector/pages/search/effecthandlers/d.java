package com.spotify.music.features.entityselector.pages.search.effecthandlers;

import defpackage.tz4;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class d<Upstream, Downstream> implements w<tz4.c, uz4> {
    final /* synthetic */ qz0 a;
    final /* synthetic */ vz0 b;

    static final class a<T, R> implements l<tz4.c, v<? extends uz4>> {
        final /* synthetic */ d a;

        a(d dVar) {
            this.a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends uz4> apply(tz4.c cVar) {
            tz4.c cVar2 = cVar;
            h.e(cVar2, "effect");
            return this.a.a.b(cVar2.b()).c(cVar2.a()).d(0, 20).build().s(new a(this)).A(new b(cVar2)).E(new c(cVar2)).P();
        }
    }

    d(qz0 qz0, vz0 vz0) {
        this.a = qz0;
        this.b = vz0;
    }

    @Override // io.reactivex.w
    public final v<uz4> apply(s<tz4.c> sVar) {
        h.e(sVar, "upstream");
        return sVar.W(new a(this), false, Integer.MAX_VALUE);
    }
}
