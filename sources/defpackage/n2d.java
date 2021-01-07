package defpackage;

import defpackage.h2d;
import defpackage.r62;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;
import io.reactivex.z;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: n2d  reason: default package */
public final class n2d implements w<h2d.a, i2d> {
    private y a;
    private final com.spotify.music.share.v2.view.b b;
    private final r62.a c;
    private final z<p62> d;

    /* renamed from: n2d$a */
    public static final class a {
        private y a;
        private final r62.a b;
        private final z<p62> c;

        public a(y yVar, r62.a aVar, z<p62> zVar) {
            h.e(yVar, "mainScheduler");
            h.e(aVar, "betamaxPlayerBuilderFactory");
            h.e(zVar, "betamaxConfiguration");
            this.a = yVar;
            this.b = aVar;
            this.c = zVar;
        }

        public final n2d a(com.spotify.music.share.v2.view.b bVar) {
            h.e(bVar, "viewInteractor");
            return new n2d(this.a, bVar, this.b, this.c, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n2d$b */
    public static final class b<T, R> implements l<h2d.a, v<? extends i2d>> {
        final /* synthetic */ n2d a;

        b(n2d n2d) {
            this.a = n2d;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends i2d> apply(h2d.a aVar) {
            h.e(aVar, "it");
            return new i(this.a.d.A(new o2d(this)).B(this.a.a).p(new p2d(this))).B().N();
        }
    }

    public n2d(y yVar, com.spotify.music.share.v2.view.b bVar, r62.a aVar, z zVar, f fVar) {
        this.a = yVar;
        this.b = bVar;
        this.c = aVar;
        this.d = zVar;
    }

    @Override // io.reactivex.w
    public v<i2d> apply(s<h2d.a> sVar) {
        h.e(sVar, "upstream");
        s<R> W = sVar.W(new b(this), false, Integer.MAX_VALUE);
        h.d(W, "upstream.flatMap {\n     …areMenuEvent>()\n        }");
        return W;
    }
}
