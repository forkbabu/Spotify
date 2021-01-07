package defpackage;

import com.spotify.music.sociallistening.models.Session;
import defpackage.rad;
import io.reactivex.functions.g;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.h;

/* renamed from: pad  reason: default package */
final class pad<T> implements g<Session> {
    final /* synthetic */ rad.a a;
    final /* synthetic */ String b;

    pad(rad.a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Session session) {
        Session session2 = session;
        h.e(session2, "decoratedSession");
        ConcurrentMap asMap = this.a.a.a.a.asMap();
        h.d(asMap, "sessionCache.asMap()");
        asMap.put(this.b, session2);
    }
}
