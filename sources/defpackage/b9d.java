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
/* renamed from: b9d  reason: default package */
public final class b9d<Upstream, Downstream> implements w<n8d.b, o8d> {
    final /* synthetic */ ConnectManager a;
    final /* synthetic */ y b;
    final /* synthetic */ w7d c;

    /* renamed from: b9d$a */
    static final class a<T, R> implements l<n8d.b, v<? extends o8d>> {
        final /* synthetic */ b9d a;

        a(b9d b9d) {
            this.a = b9d;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends o8d> apply(n8d.b bVar) {
            h.e(bVar, "it");
            w9d w9d = w9d.a;
            b9d b9d = this.a;
            z a2 = w9d.a(w9d, b9d.a, b9d.b);
            b9d b9d2 = this.a;
            return a2.f(new u8d(b9d2.c, b9d2.b)).P().r0(a9d.a);
        }
    }

    b9d(ConnectManager connectManager, y yVar, w7d w7d) {
        this.a = connectManager;
        this.b = yVar;
        this.c = w7d;
    }

    @Override // io.reactivex.w
    public final v<o8d> apply(s<n8d.b> sVar) {
        h.e(sVar, "upstream");
        return sVar.W(new a(this), false, Integer.MAX_VALUE);
    }
}
