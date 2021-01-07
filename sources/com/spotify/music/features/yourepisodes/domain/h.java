package com.spotify.music.features.yourepisodes.domain;

import com.spotify.music.features.yourepisodes.domain.f;
import com.spotify.music.features.yourepisodes.interactor.d;
import io.reactivex.functions.l;
import io.reactivex.v;

final class h<T, R> implements l<f.e, v<? extends j>> {
    final /* synthetic */ d a;

    h(d dVar) {
        this.a = dVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public v<? extends j> apply(f.e eVar) {
        f.e eVar2 = eVar;
        kotlin.jvm.internal.h.e(eVar2, "effect");
        return yy8.b(this.a, null, 1, null).j0(new g(eVar2));
    }
}
