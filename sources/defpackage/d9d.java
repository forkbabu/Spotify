package defpackage;

import com.spotify.libs.connect.ConnectManager;
import defpackage.n8d;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: d9d  reason: default package */
public final class d9d<Upstream, Downstream> implements w<n8d.c, o8d> {
    final /* synthetic */ ConnectManager a;
    final /* synthetic */ y b;
    final /* synthetic */ w7d c;

    /* renamed from: d9d$a */
    static final class a<T, R> implements l<n8d.c, v<? extends o8d>> {
        final /* synthetic */ d9d a;

        a(d9d d9d) {
            this.a = d9d;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends o8d> apply(n8d.c cVar) {
            h.e(cVar, "it");
            w9d w9d = w9d.a;
            d9d d9d = this.a;
            z a2 = w9d.a(w9d, d9d.a, d9d.b);
            d9d d9d2 = this.a;
            return a2.f(new w8d(d9d2.c, d9d2.b)).P().r0(c9d.a);
        }
    }

    d9d(ConnectManager connectManager, y yVar, w7d w7d) {
        this.a = connectManager;
        this.b = yVar;
        this.c = w7d;
    }

    @Override // io.reactivex.w
    public final v<o8d> apply(s<n8d.c> sVar) {
        h.e(sVar, "upstream");
        return sVar.W(new a(this), false, Integer.MAX_VALUE);
    }
}
