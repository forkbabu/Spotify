package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.sociallistening.models.Session;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;
import retrofit2.v;

/* renamed from: s8d  reason: default package */
final class s8d<T, R> implements l<v<Session>, Session> {
    public static final s8d a = new s8d();

    s8d() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Session apply(v<Session> vVar) {
        v<Session> vVar2 = vVar;
        h.e(vVar2, "sessionResponse");
        if (vVar2.f()) {
            return vVar2.a();
        }
        Logger.d("social listening impl: response for currentOrNewSession was: %d", Integer.valueOf(vVar2.b()));
        return Session.EMPTY;
    }
}
