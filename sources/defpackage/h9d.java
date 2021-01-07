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
/* renamed from: h9d  reason: default package */
public final class h9d<Upstream, Downstream> implements w<n8d.e, o8d> {
    final /* synthetic */ ConnectManager a;
    final /* synthetic */ y b;
    final /* synthetic */ w7d c;

    /* renamed from: h9d$a */
    static final class a<T, R> implements l<n8d.e, v<? extends o8d>> {
        final /* synthetic */ h9d a;

        a(h9d h9d) {
            this.a = h9d;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends o8d> apply(n8d.e eVar) {
            n8d.e eVar2 = eVar;
            h.e(eVar2, "leaveSession");
            w9d w9d = w9d.a;
            h9d h9d = this.a;
            z a2 = w9d.a(w9d, h9d.a, h9d.b);
            String a3 = eVar2.a();
            h9d h9d2 = this.a;
            return a2.f(new q9d(h9d2.c, a3, h9d2.b)).P().r0(g9d.a);
        }
    }

    h9d(ConnectManager connectManager, y yVar, w7d w7d) {
        this.a = connectManager;
        this.b = yVar;
        this.c = w7d;
    }

    @Override // io.reactivex.w
    public final v<o8d> apply(s<n8d.e> sVar) {
        h.e(sVar, "upstream");
        return sVar.J0(new a(this));
    }
}
