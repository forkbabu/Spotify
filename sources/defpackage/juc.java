package defpackage;

import com.spotify.music.podcastinteractivity.qna.datasource.j;
import defpackage.wtc;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* renamed from: juc  reason: default package */
final class juc<Upstream, Downstream> implements w<wtc.c, xtc> {
    final /* synthetic */ jvc a;
    final /* synthetic */ j b;

    /* renamed from: juc$a */
    static final class a<T, R> implements l<wtc.c, v<? extends xtc>> {
        final /* synthetic */ juc a;

        a(juc juc) {
            this.a = juc;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends xtc> apply(wtc.c cVar) {
            wtc.c cVar2 = cVar;
            h.e(cVar2, "it");
            return this.a.a.d(cVar2.a()).o(new fuc(this)).k(new guc(this)).A(new huc(this)).E(new iuc(this)).P();
        }
    }

    juc(jvc jvc, j jVar) {
        this.a = jvc;
        this.b = jVar;
    }

    @Override // io.reactivex.w
    public final v<xtc> apply(s<wtc.c> sVar) {
        h.e(sVar, "upstream");
        return sVar.W(new a(this), false, Integer.MAX_VALUE);
    }
}
