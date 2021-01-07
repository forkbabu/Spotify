package com.spotify.music.features.followfeed.mobius.effecthandlers;

import defpackage.o25;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class j<T, R> implements l<Throwable, o25> {
    public static final j a = new j();

    j() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public o25 apply(Throwable th) {
        h.e(th, "it");
        return new o25.n(new j25(null, null, null, 7));
    }
}
