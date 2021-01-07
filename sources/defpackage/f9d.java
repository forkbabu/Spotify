package defpackage;

import com.spotify.libs.connect.ConnectManager;
import com.spotify.music.sociallistening.models.JoinType;
import defpackage.n8d;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: f9d  reason: default package */
public final class f9d<Upstream, Downstream> implements w<n8d.d, o8d> {
    final /* synthetic */ ConnectManager a;
    final /* synthetic */ y b;
    final /* synthetic */ w7d c;

    /* renamed from: f9d$a */
    static final class a<T, R> implements l<n8d.d, v<? extends o8d>> {
        final /* synthetic */ f9d a;

        a(f9d f9d) {
            this.a = f9d;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends o8d> apply(n8d.d dVar) {
            n8d.d dVar2 = dVar;
            h.e(dVar2, "joinSession");
            w9d w9d = w9d.a;
            f9d f9d = this.a;
            z a2 = w9d.a(w9d, f9d.a, f9d.b);
            String a3 = dVar2.a();
            boolean c = dVar2.c();
            JoinType b = dVar2.b();
            f9d f9d2 = this.a;
            return a2.f(new p9d(f9d2.c, a3, c, b, f9d2.b)).P().r0(e9d.a);
        }
    }

    f9d(ConnectManager connectManager, y yVar, w7d w7d) {
        this.a = connectManager;
        this.b = yVar;
        this.c = w7d;
    }

    @Override // io.reactivex.w
    public final v<o8d> apply(s<n8d.d> sVar) {
        h.e(sVar, "upstream");
        return sVar.J0(new a(this));
    }
}
