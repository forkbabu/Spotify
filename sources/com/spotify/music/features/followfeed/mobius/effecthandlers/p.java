package com.spotify.music.features.followfeed.mobius.effecthandlers;

import defpackage.n25;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

public final class p implements g<n25.f> {
    private final c25 a;

    public p(c25 c25) {
        h.e(c25, "eventLogger");
        this.a = c25;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(n25.f fVar) {
        n25.f fVar2 = fVar;
        h.e(fVar2, "effect");
        this.a.b(fVar2.a());
    }
}
