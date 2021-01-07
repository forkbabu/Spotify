package defpackage;

import com.spotify.music.sociallistening.models.Session;
import defpackage.o8d;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;
import retrofit2.v;

/* renamed from: o9d  reason: default package */
final class o9d<T, R> implements l<v<Session>, o8d.g> {
    public static final o9d a = new o9d();

    o9d() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public o8d.g apply(v<Session> vVar) {
        v<Session> vVar2 = vVar;
        h.e(vVar2, "sessionResponse");
        return new o8d.g(vVar2);
    }
}
