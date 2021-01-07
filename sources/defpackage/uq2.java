package defpackage;

import io.reactivex.functions.l;
import io.reactivex.functions.n;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: uq2  reason: default package */
public final class uq2 {
    private final s<b91> a;
    private final vq2 b;
    private final wq2 c;

    /* renamed from: uq2$a */
    static final class a<T> implements n<b91> {
        public static final a a = new a();

        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(b91 b91) {
            b91 b912 = b91;
            h.e(b912, "it");
            return !b912.body().isEmpty();
        }
    }

    /* renamed from: uq2$b */
    static final class b<T, R> implements l<b91, com.spotify.music.carmodehome.model.a> {
        final /* synthetic */ uq2 a;

        b(uq2 uq2) {
            this.a = uq2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public com.spotify.music.carmodehome.model.a apply(b91 b91) {
            b91 b912 = b91;
            h.e(b912, "it");
            return new com.spotify.music.carmodehome.model.a(this.a.c.a(this.a.b.a(b912.body())));
        }
    }

    public uq2(s<b91> sVar, vq2 vq2, wq2 wq2) {
        h.e(sVar, "hubsViewModelObservable");
        h.e(vq2, "homeHubsShelvesFilter");
        h.e(wq2, "hubsComponentModelToHomeShelfTransformer");
        this.a = sVar;
        this.b = vq2;
        this.c = wq2;
    }

    public final s<com.spotify.music.carmodehome.model.a> c() {
        s<R> j0 = this.a.Q(a.a).j0(new b(this));
        h.d(j0, "hubsViewModelObservable\n…          )\n            }");
        return j0;
    }
}
