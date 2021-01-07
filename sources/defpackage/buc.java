package defpackage;

import com.spotify.mobius.rx2.m;
import com.spotify.music.podcastinteractivity.qna.datasource.i;
import com.spotify.music.podcastinteractivity.qna.datasource.j;
import defpackage.wtc;
import io.reactivex.functions.g;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* renamed from: buc  reason: default package */
public final class buc {

    /* renamed from: buc$a */
    /* compiled from: java-style lambda group */
    static final class a implements io.reactivex.functions.a {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            int i = this.a;
            if (i == 0) {
                ((j) this.b).c(i.f.a);
            } else if (i == 1) {
                ((j) this.b).c(i.e.a);
            } else {
                throw null;
            }
        }
    }

    /* renamed from: buc$b */
    static final class b<T> implements g<wtc.a> {
        final /* synthetic */ j a;

        b(j jVar) {
            this.a = jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(wtc.a aVar) {
            this.a.c(new i.a(aVar.a()));
        }
    }

    public static final w<wtc, xtc> a(jvc jvc, j jVar, vuc vuc) {
        h.e(jvc, "podcastQnAEndpoint");
        h.e(jVar, "qnAEventConsumer");
        h.e(vuc, "profileDataSource");
        m f = com.spotify.mobius.rx2.i.f();
        h.e(jvc, "qnAEndpoint");
        f.h(wtc.d.class, new muc(jvc));
        h.e(jvc, "podcastQnAEndpoint");
        h.e(jVar, "qnAEventConsumer");
        f.h(wtc.h.class, new uuc(jvc, jVar));
        h.e(vuc, "profileDataSource");
        f.h(wtc.e.class, new puc(vuc));
        h.e(jvc, "podcastQnAEndpoint");
        h.e(jVar, "qnAEventConsumer");
        f.h(wtc.c.class, new juc(jvc, jVar));
        h.e(jvc, "podcastQnAEndpoint");
        h.e(jVar, "qnAEventConsumer");
        f.h(wtc.b.class, new euc(jvc, jVar));
        f.d(wtc.a.class, new b(jVar));
        f.b(wtc.g.class, new a(0, jVar));
        f.b(wtc.f.class, new a(1, jVar));
        return f.i();
    }
}
