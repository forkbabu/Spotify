package com.spotify.music.features.followfeed.mobius.effecthandlers;

import com.spotify.music.follow.j;
import defpackage.o25;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class l<T, R> implements io.reactivex.functions.l<j, o25> {
    final /* synthetic */ k a;
    final /* synthetic */ String b;

    l(k kVar, String str) {
        this.a = kVar;
        this.b = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public o25 apply(j jVar) {
        j jVar2 = jVar;
        h.e(jVar2, "data");
        this.a.a.g(jVar2);
        k.c(this.a, jVar2, this.b);
        return o25.o.a;
    }
}
