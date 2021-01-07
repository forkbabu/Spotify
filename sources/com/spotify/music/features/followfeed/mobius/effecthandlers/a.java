package com.spotify.music.features.followfeed.mobius.effecthandlers;

import defpackage.n25;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

public final class a implements g<n25.a> {
    private final com.spotify.music.features.followfeed.a a;
    private final com.spotify.music.features.followfeed.persistence.a b;

    public a(com.spotify.music.features.followfeed.a aVar, com.spotify.music.features.followfeed.persistence.a aVar2) {
        h.e(aVar, "followManager");
        h.e(aVar2, "cacheManager");
        this.a = aVar;
        this.b = aVar2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(n25.a aVar) {
        n25.a aVar2 = aVar;
        h.e(aVar2, "effect");
        this.b.c(aVar2.a(), aVar2.b());
        this.a.b(aVar2.a(), this.b);
    }
}
