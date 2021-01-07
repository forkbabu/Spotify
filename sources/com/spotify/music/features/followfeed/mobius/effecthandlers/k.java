package com.spotify.music.features.followfeed.mobius.effecthandlers;

import com.spotify.music.follow.j;
import defpackage.n25;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;

public final class k implements w<n25.d, o25> {
    private final com.spotify.music.features.followfeed.a a;
    private final com.spotify.music.features.followfeed.persistence.a b;

    static final class a<T, R> implements l<n25.d, v<? extends o25>> {
        final /* synthetic */ k a;

        a(k kVar) {
            this.a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends o25> apply(n25.d dVar) {
            n25.d dVar2 = dVar;
            h.e(dVar2, "effect");
            String a2 = dVar2.a();
            k kVar = this.a;
            return s.i0(Boolean.valueOf(k.c(kVar, kVar.a.c(a2), a2))).W(new i(this, a2), false, Integer.MAX_VALUE).r0(j.a);
        }
    }

    public k(com.spotify.music.features.followfeed.a aVar, com.spotify.music.features.followfeed.persistence.a aVar2) {
        h.e(aVar, "followManager");
        h.e(aVar2, "cacheManager");
        this.a = aVar;
        this.b = aVar2;
    }

    public static final s b(k kVar, String str) {
        s<R> j0 = kVar.a.a(str).N0(1).j0(new l(kVar, str));
        h.d(j0, "followManager\n          …stSucceeded\n            }");
        return j0;
    }

    public static final boolean c(k kVar, j jVar, String str) {
        kVar.getClass();
        if (jVar == null) {
            return false;
        }
        jVar.g();
        kVar.b.e();
        kVar.a.e(str, true);
        return true;
    }

    @Override // io.reactivex.w
    public v<o25> apply(s<n25.d> sVar) {
        h.e(sVar, "upstream");
        s<R> J0 = sVar.J0(new a(this));
        h.d(J0, "upstream.switchMap { eff…led(Artist()) }\n        }");
        return J0;
    }
}
