package com.spotify.music.features.entityselector.pages.search.effecthandlers;

import defpackage.tz4;
import defpackage.uz4;
import defpackage.xz4;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class c<T, R> implements l<Throwable, uz4> {
    final /* synthetic */ tz4.c a;

    c(tz4.c cVar) {
        this.a = cVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public uz4 apply(Throwable th) {
        h.e(th, "it");
        return new uz4.f(new xz4.b(this.a.b()));
    }
}
