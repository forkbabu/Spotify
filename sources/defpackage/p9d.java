package defpackage;

import com.spotify.music.sociallistening.models.JoinType;
import defpackage.o8d;
import io.reactivex.d0;
import io.reactivex.e0;
import io.reactivex.functions.l;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

/* renamed from: p9d  reason: default package */
final class p9d<Upstream, Downstream> implements e0<String, o8d.g> {
    final /* synthetic */ w7d a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;
    final /* synthetic */ JoinType d;
    final /* synthetic */ y e;

    /* renamed from: p9d$a */
    static final class a<T, R> implements l<String, d0<? extends o8d.g>> {
        final /* synthetic */ p9d a;

        a(p9d p9d) {
            this.a = p9d;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends o8d.g> apply(String str) {
            String str2 = str;
            h.e(str2, "localDeviceId");
            p9d p9d = this.a;
            return p9d.a.c(p9d.b, p9d.c ? "listen_and_control" : "control", str2, p9d.d.d()).A(o9d.a).J((long) 10000, TimeUnit.MILLISECONDS, this.a.e).m(new v9d("Failed to join session %s", new Object[]{this.a.b}));
        }
    }

    p9d(w7d w7d, String str, boolean z, JoinType joinType, y yVar) {
        this.a = w7d;
        this.b = str;
        this.c = z;
        this.d = joinType;
        this.e = yVar;
    }

    @Override // io.reactivex.e0
    public final d0<o8d.g> a(z<String> zVar) {
        h.e(zVar, "upstream");
        return zVar.s(new a(this));
    }
}
