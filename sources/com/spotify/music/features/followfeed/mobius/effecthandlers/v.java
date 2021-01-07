package com.spotify.music.features.followfeed.mobius.effecthandlers;

import com.spotify.music.features.followfeed.persistence.f;
import defpackage.n25;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.w;
import kotlin.jvm.internal.h;

public final class v implements w<n25.i, o25> {
    private final f a;

    static final class a<T, R> implements l<n25.i, io.reactivex.v<? extends o25>> {
        final /* synthetic */ v a;

        a(v vVar) {
            this.a = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public io.reactivex.v<? extends o25> apply(n25.i iVar) {
            n25.i iVar2 = iVar;
            h.e(iVar2, "effect");
            return this.a.a.c(iVar2.a()).d(this.a.a.d(false)).B().N();
        }
    }

    public v(f fVar) {
        h.e(fVar, "cache");
        this.a = fVar;
    }

    @Override // io.reactivex.w
    public io.reactivex.v<o25> apply(s<n25.i> sVar) {
        h.e(sVar, "upstream");
        s<R> J0 = sVar.J0(new a(this));
        h.d(J0, "upstream.switchMap { eff…le<FeedEvent>()\n        }");
        return J0;
    }
}
