package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.sociallistening.models.Session;
import defpackage.o8d;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;
import retrofit2.v;

/* renamed from: v8d  reason: default package */
final class v8d<T, R> implements l<v<Session>, o8d> {
    public static final v8d a = new v8d();

    v8d() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public o8d apply(v<Session> vVar) {
        v<Session> vVar2 = vVar;
        h.e(vVar2, "sessionResponse");
        if (vVar2.f()) {
            Session a2 = vVar2.a();
            h.c(a2);
            h.d(a2, "sessionResponse.body()!!");
            return new o8d.e(a2);
        } else if (vVar2.b() == 404) {
            Logger.b("social listening impl: user has no session in backend", new Object[0]);
            return new o8d.e(Session.EMPTY);
        } else {
            Logger.b("social listening impl: current session request failed", new Object[0]);
            return o8d.d.a;
        }
    }
}
