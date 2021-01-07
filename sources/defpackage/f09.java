package defpackage;

import com.spotify.music.features.yourepisodes.domain.c;
import com.spotify.music.features.yourepisodes.domain.j;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: f09  reason: default package */
final class f09<T, R> implements l<onc, j> {
    final /* synthetic */ g09 a;

    f09(g09 g09) {
        this.a = g09;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public j apply(onc onc) {
        onc onc2 = onc;
        h.e(onc2, "newPlayerState");
        return new j.e(new c(onc2, this.a.b.a(onc2)));
    }
}
