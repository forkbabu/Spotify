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
/* renamed from: z8d  reason: default package */
public final class z8d<Upstream, Downstream> implements w<n8d.a, o8d> {
    final /* synthetic */ ConnectManager a;
    final /* synthetic */ y b;
    final /* synthetic */ w7d c;

    /* renamed from: z8d$a */
    static final class a<T, R> implements l<n8d.a, v<? extends o8d>> {
        final /* synthetic */ z8d a;

        a(z8d z8d) {
            this.a = z8d;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends o8d> apply(n8d.a aVar) {
            n8d.a aVar2 = aVar;
            h.e(aVar2, "deleteSession");
            w9d w9d = w9d.a;
            z8d z8d = this.a;
            z a2 = w9d.a(w9d, z8d.a, z8d.b);
            String a3 = aVar2.a();
            z8d z8d2 = this.a;
            return a2.f(new x8d(z8d2.c, a3, z8d2.b)).P().r0(y8d.a);
        }
    }

    z8d(ConnectManager connectManager, y yVar, w7d w7d) {
        this.a = connectManager;
        this.b = yVar;
        this.c = w7d;
    }

    @Override // io.reactivex.w
    public final v<o8d> apply(s<n8d.a> sVar) {
        h.e(sVar, "upstream");
        return sVar.J0(new a(this));
    }
}
