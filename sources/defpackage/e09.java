package defpackage;

import com.spotify.music.features.yourepisodes.domain.a;
import com.spotify.music.features.yourepisodes.domain.j;
import com.spotify.music.features.yourepisodes.interactor.c;
import io.reactivex.functions.l;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: e09  reason: default package */
final class e09<T, R> implements l<c, j> {
    public static final e09 a = new e09();

    e09() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public j apply(c cVar) {
        c cVar2 = cVar;
        h.e(cVar2, "episodesSub");
        h.e(cVar2, "subscription");
        List<a> b = cVar2.b();
        int c = cVar2.c();
        List<a> b2 = cVar2.b();
        h.e(b2, "$this$indices");
        return new j.c(b, c, new jnf(0, b2.size() - 1), cVar2.a());
    }
}
