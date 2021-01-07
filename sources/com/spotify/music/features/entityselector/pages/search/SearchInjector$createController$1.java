package com.spotify.music.features.entityselector.pages.search;

import com.spotify.mobius.s;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class SearchInjector$createController$1 extends FunctionReferenceImpl implements nmf<wz4, s<wz4, tz4>> {
    public static final SearchInjector$createController$1 a = new SearchInjector$createController$1();

    SearchInjector$createController$1() {
        super(1, vz4.class, "init", "init(Lcom/spotify/music/features/entityselector/pages/search/domain/SearchModel;)Lcom/spotify/mobius/First;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public s<wz4, tz4> invoke(wz4 wz4) {
        wz4 wz42 = wz4;
        h.e(wz42, "p1");
        h.e(wz42, "model");
        s<wz4, tz4> b = s.b(wz42);
        h.d(b, "First.first(model)");
        return b;
    }
}
