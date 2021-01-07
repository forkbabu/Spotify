package com.spotify.music.features.yourepisodes.domain;

import com.spotify.music.features.yourepisodes.domain.f;
import com.spotify.music.features.yourepisodes.domain.j;
import com.spotify.music.features.yourepisodes.interactor.c;
import io.reactivex.functions.l;
import java.util.List;
import kotlin.jvm.internal.h;

final class g<T, R> implements l<c, j.c> {
    final /* synthetic */ f.e a;

    g(f.e eVar) {
        this.a = eVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public j.c apply(c cVar) {
        c cVar2 = cVar;
        h.e(cVar2, "subscription");
        h.e(cVar2, "subscription");
        List<a> b = cVar2.b();
        int c = cVar2.c();
        List<a> b2 = cVar2.b();
        h.e(b2, "$this$indices");
        return j.c.a(new j.c(b, c, new jnf(0, b2.size() - 1), cVar2.a()), null, 0, this.a.a().a(), null, 11);
    }
}
