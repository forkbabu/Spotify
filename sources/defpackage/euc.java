package defpackage;

import com.spotify.music.podcastinteractivity.qna.datasource.j;
import defpackage.wtc;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* renamed from: euc  reason: default package */
final class euc<Upstream, Downstream> implements w<wtc.b, xtc> {
    final /* synthetic */ jvc a;
    final /* synthetic */ j b;

    /* renamed from: euc$a */
    static final class a<T, R> implements l<wtc.b, v<? extends xtc>> {
        final /* synthetic */ euc a;

        a(euc euc) {
            this.a = euc;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends xtc> apply(wtc.b bVar) {
            wtc.b bVar2 = bVar;
            h.e(bVar2, "it");
            return this.a.a.c().A(new cuc(this, bVar2)).E(duc.a).P();
        }
    }

    euc(jvc jvc, j jVar) {
        this.a = jvc;
        this.b = jVar;
    }

    @Override // io.reactivex.w
    public final v<xtc> apply(s<wtc.b> sVar) {
        h.e(sVar, "upstream");
        return sVar.W(new a(this), false, Integer.MAX_VALUE);
    }
}
