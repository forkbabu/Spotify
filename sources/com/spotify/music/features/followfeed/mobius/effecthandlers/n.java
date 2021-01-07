package com.spotify.music.features.followfeed.mobius.effecthandlers;

import defpackage.n25;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

public final class n implements g<n25.e> {
    private final c25 a;

    public n(c25 c25) {
        h.e(c25, "eventLogger");
        this.a = c25;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(n25.e eVar) {
        n25.e eVar2 = eVar;
        h.e(eVar2, "effect");
        this.a.c(eVar2.a());
    }
}
