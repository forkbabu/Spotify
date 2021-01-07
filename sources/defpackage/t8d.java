package defpackage;

import com.spotify.music.sociallistening.models.Session;
import defpackage.o8d;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: t8d  reason: default package */
final class t8d<T, R> implements l<Session, o8d.c> {
    public static final t8d a = new t8d();

    t8d() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public o8d.c apply(Session session) {
        Session session2 = session;
        h.e(session2, "session");
        return new o8d.c(session2);
    }
}
