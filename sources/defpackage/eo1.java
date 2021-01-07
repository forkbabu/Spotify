package defpackage;

import com.spotify.mobile.android.share.menu.preview.domain.b;
import com.spotify.mobile.android.share.menu.preview.domain.c;
import com.spotify.mobile.android.share.menu.preview.domain.d;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;
import io.reactivex.z;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: eo1  reason: default package */
final class eo1<Upstream, Downstream> implements w<c.b, d> {
    final /* synthetic */ y a;
    final /* synthetic */ List b;

    /* renamed from: eo1$a */
    static final class a<T, R> implements l<c.b, v<? extends d>> {
        final /* synthetic */ eo1 a;

        a(eo1 eo1) {
            this.a = eo1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends d> apply(c.b bVar) {
            c.b bVar2 = bVar;
            h.e(bVar2, "it");
            return z.g(new bo1(this, bVar2)).A(co1.a).F((R) b.a.a).A(new do1(bVar2)).P();
        }
    }

    eo1(y yVar, List list) {
        this.a = yVar;
        this.b = list;
    }

    @Override // io.reactivex.w
    public final v<d> apply(s<c.b> sVar) {
        h.e(sVar, "upstream");
        return sVar.o0(this.a).W(new a(this), false, Integer.MAX_VALUE);
    }
}
