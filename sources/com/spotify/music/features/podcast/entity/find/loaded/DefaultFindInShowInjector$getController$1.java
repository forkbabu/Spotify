package com.spotify.music.features.podcast.entity.find.loaded;

import com.spotify.mobius.s;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class DefaultFindInShowInjector$getController$1 extends FunctionReferenceImpl implements nmf<w37, s<w37, Object>> {
    public static final DefaultFindInShowInjector$getController$1 a = new DefaultFindInShowInjector$getController$1();

    DefaultFindInShowInjector$getController$1() {
        super(1, v37.class, "init", "init(Lcom/spotify/music/features/podcast/entity/find/loaded/domain/FindInShowModel;)Lcom/spotify/mobius/First;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public s<w37, Object> invoke(w37 w37) {
        w37 w372 = w37;
        h.e(w372, "p1");
        h.e(w372, "model");
        s<w37, Object> b = s.b(w372);
        h.d(b, "First.first(model)");
        return b;
    }
}
