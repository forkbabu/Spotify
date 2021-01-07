package defpackage;

import com.spotify.music.features.yourepisodes.domain.j;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: d09  reason: default package */
final class d09<T, R> implements l<Boolean, j> {
    public static final d09 a = new d09();

    d09() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public j apply(Boolean bool) {
        Boolean bool2 = bool;
        h.e(bool2, "downloadAllEnabled");
        return new j.a(bool2.booleanValue());
    }
}
