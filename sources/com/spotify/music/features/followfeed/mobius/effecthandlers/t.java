package com.spotify.music.features.followfeed.mobius.effecthandlers;

import defpackage.n25;
import defpackage.x25;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class t implements w<n25.h, o25> {
    private final x35 a;

    static final class a<T, R> implements l<n25.h, v<? extends o25>> {
        final /* synthetic */ t a;

        a(t tVar) {
            this.a = tVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends o25> apply(n25.h hVar) {
            n25.h hVar2 = hVar;
            h.e(hVar2, "effect");
            return t.a(this.a, hVar2.a()).B().N();
        }
    }

    public t(x35 x35) {
        h.e(x35, "player");
        this.a = x35;
    }

    public static final io.reactivex.a a(t tVar, x25 x25) {
        tVar.getClass();
        if (x25 instanceof x25.b) {
            x25.b bVar = (x25.b) x25;
            return tVar.a.d(bVar.a(), bVar.b());
        } else if (x25 instanceof x25.a) {
            return tVar.a.a();
        } else {
            if (x25 instanceof x25.c) {
                return tVar.a.b();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // io.reactivex.w
    public v<o25> apply(s<n25.h> sVar) {
        h.e(sVar, "upstream");
        s<R> J0 = sVar.J0(new a(this));
        h.d(J0, "upstream.switchMap { eff…le<FeedEvent>()\n        }");
        return J0;
    }
}
