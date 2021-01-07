package com.spotify.music.libs.accountlinkingnudges;

import defpackage.rga;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class d<T, R> implements l<rga, Boolean> {
    public static final d a = new d();

    d() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Boolean apply(rga rga) {
        rga rga2 = rga;
        h.e(rga2, "it");
        return Boolean.valueOf(h.a(rga2, rga.c.a));
    }
}
