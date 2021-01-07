package defpackage;

import com.spotify.music.sociallistening.models.Session;
import defpackage.o8d;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: a9d  reason: default package */
final class a9d<T, R> implements l<Throwable, o8d.c> {
    public static final a9d a = new a9d();

    a9d() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public o8d.c apply(Throwable th) {
        h.e(th, "it");
        return new o8d.c(Session.EMPTY);
    }
}
