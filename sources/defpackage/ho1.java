package defpackage;

import com.spotify.mobile.android.share.menu.preview.api.h;
import com.spotify.mobile.android.share.menu.preview.domain.c;
import com.spotify.mobile.android.share.menu.preview.domain.d;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.Map;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: ho1  reason: default package */
public final class ho1<Upstream, Downstream> implements w<c.C0188c, d> {
    final /* synthetic */ Map a;

    /* renamed from: ho1$a */
    static final class a<T, R> implements l<c.C0188c, v<? extends d>> {
        final /* synthetic */ ho1 a;

        a(ho1 ho1) {
            this.a = ho1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends d> apply(c.C0188c cVar) {
            c.C0188c cVar2 = cVar;
            h.e(cVar2, "it");
            return s.c0(new fo1(this, cVar2)).j0(go1.a).s0((R) new d.f(new h.a(cVar2.a())));
        }
    }

    ho1(Map map) {
        this.a = map;
    }

    @Override // io.reactivex.w
    public final v<d> apply(s<c.C0188c> sVar) {
        kotlin.jvm.internal.h.e(sVar, "upstream");
        return sVar.W(new a(this), false, Integer.MAX_VALUE);
    }
}
