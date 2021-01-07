package com.spotify.music.features.followfeed.mobius.effecthandlers;

import com.spotify.music.navigation.t;
import defpackage.n25;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

public final class r implements g<n25.g> {
    private final t a;

    public r(t tVar) {
        h.e(tVar, "navigator");
        this.a = tVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(n25.g gVar) {
        n25.g gVar2 = gVar;
        h.e(gVar2, "effect");
        this.a.d(gVar2.a());
    }
}
