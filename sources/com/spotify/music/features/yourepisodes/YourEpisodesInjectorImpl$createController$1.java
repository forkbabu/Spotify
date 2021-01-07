package com.spotify.music.features.yourepisodes;

import com.spotify.mobius.s;
import com.spotify.music.features.yourepisodes.domain.f;
import com.spotify.music.features.yourepisodes.domain.k;
import com.spotify.music.features.yourepisodes.domain.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class YourEpisodesInjectorImpl$createController$1 extends FunctionReferenceImpl implements nmf<l, s<l, f>> {
    public static final YourEpisodesInjectorImpl$createController$1 a = new YourEpisodesInjectorImpl$createController$1();

    YourEpisodesInjectorImpl$createController$1() {
        super(1, k.class, "init", "init(Lcom/spotify/music/features/yourepisodes/domain/YourEpisodesModel;)Lcom/spotify/mobius/First;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public s<l, f> invoke(l lVar) {
        l lVar2 = lVar;
        h.e(lVar2, "p1");
        h.e(lVar2, "model");
        s<l, f> b = s.b(lVar2);
        h.d(b, "First.first(model)");
        return b;
    }
}
