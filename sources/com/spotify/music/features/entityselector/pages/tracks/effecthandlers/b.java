package com.spotify.music.features.entityselector.pages.tracks.effecthandlers;

import defpackage.d05;
import defpackage.g05;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class b<T, R> implements l<Throwable, d05> {
    public static final b a = new b();

    b() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public d05 apply(Throwable th) {
        h.e(th, "it");
        return new d05.g(g05.b.a);
    }
}
