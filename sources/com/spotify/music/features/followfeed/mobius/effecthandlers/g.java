package com.spotify.music.features.followfeed.mobius.effecthandlers;

import com.spotify.music.features.followfeed.network.c;
import defpackage.n25;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.List;
import kotlin.jvm.internal.h;

public final class g implements w<n25.c, o25> {
    private final c a;
    private final l<k35, List<p25>> b;

    static final class a<T, R> implements l<n25.c, v<? extends o25>> {
        final /* synthetic */ g a;

        a(g gVar) {
            this.a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends o25> apply(n25.c cVar) {
            n25.c cVar2 = cVar;
            h.e(cVar2, "effect");
            return this.a.a.a(cVar2.a()).A(this.a.b).A(e.a).P().r0(f.a);
        }
    }

    public g(c cVar, l<k35, List<p25>> lVar) {
        h.e(cVar, "feedDataSource");
        h.e(lVar, "dataToMobiusTranslator");
        this.a = cVar;
        this.b = lVar;
    }

    @Override // io.reactivex.w
    public v<o25> apply(s<n25.c> sVar) {
        h.e(sVar, "upstream");
        s<R> J0 = sVar.J0(new a(this));
        h.d(J0, "upstream.switchMap { eff…tchDataFailed }\n        }");
        return J0;
    }
}
