package defpackage;

import com.spotify.music.sociallistening.models.Session;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.single.n;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* renamed from: rad  reason: default package */
final class rad<Upstream, Downstream> implements w<String, Session> {
    final /* synthetic */ oad a;

    /* renamed from: rad$a */
    static final class a<T, R> implements l<String, v<? extends Session>> {
        final /* synthetic */ rad a;

        a(rad rad) {
            this.a = rad;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends Session> apply(String str) {
            String str2 = str;
            h.e(str2, "token");
            Session session = (Session) this.a.a.a.asMap().get(str2);
            if (session != null) {
                s.i0(session);
            }
            return this.a.a.e.a(str2).p(new pad(this, str2)).m(new qad(this)).C(n.a).P();
        }
    }

    rad(oad oad) {
        this.a = oad;
    }

    @Override // io.reactivex.w
    public final v<Session> apply(s<String> sVar) {
        h.e(sVar, "upstream");
        return sVar.w(new a(this));
    }
}
