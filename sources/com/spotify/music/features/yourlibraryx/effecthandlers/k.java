package com.spotify.music.features.yourlibraryx.effecthandlers;

import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.c;
import com.spotify.music.features.yourlibraryx.domain.h;
import io.reactivex.functions.l;

final class k<T, R> implements l<h, YourLibraryXEvent.f> {
    final /* synthetic */ c.m a;

    k(c.m mVar) {
        this.a = mVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public YourLibraryXEvent.f apply(h hVar) {
        h hVar2 = hVar;
        kotlin.jvm.internal.h.e(hVar2, "it");
        return new YourLibraryXEvent.f(hVar2, this.a.a());
    }
}
