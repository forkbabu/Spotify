package com.spotify.music.features.followfeed.mobius.effecthandlers;

import defpackage.n25;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;

public final class c implements w<n25.b, o25> {
    private final com.spotify.music.features.followfeed.network.a a;

    static final class a<T, R> implements l<n25.b, v<? extends o25>> {
        final /* synthetic */ c a;

        a(c cVar) {
            this.a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends o25> apply(n25.b bVar) {
            n25.b bVar2 = bVar;
            h.e(bVar2, "effect");
            return this.a.a.a(bVar2.a()).B().N();
        }
    }

    public c(com.spotify.music.features.followfeed.network.a aVar) {
        h.e(aVar, "dismissArtistClient");
        this.a = aVar;
    }

    @Override // io.reactivex.w
    public v<o25> apply(s<n25.b> sVar) {
        h.e(sVar, "upstream");
        s<R> J0 = sVar.J0(new a(this));
        h.d(J0, "upstream.switchMap { eff…le<FeedEvent>()\n        }");
        return J0;
    }
}
