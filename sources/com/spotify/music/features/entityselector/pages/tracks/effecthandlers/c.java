package com.spotify.music.features.entityselector.pages.tracks.effecthandlers;

import defpackage.c05;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class c<Upstream, Downstream> implements w<c05.b, d05> {
    final /* synthetic */ z a;

    static final class a<T, R> implements l<c05.b, v<? extends d05>> {
        final /* synthetic */ c a;

        a(c cVar) {
            this.a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends d05> apply(c05.b bVar) {
            c05.b bVar2 = bVar;
            h.e(bVar2, "effect");
            return this.a.a.A(new a(bVar2)).E(b.a).P();
        }
    }

    c(z zVar) {
        this.a = zVar;
    }

    @Override // io.reactivex.w
    public final v<d05> apply(s<c05.b> sVar) {
        h.e(sVar, "upstream");
        return sVar.W(new a(this), false, Integer.MAX_VALUE);
    }
}
