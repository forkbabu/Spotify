package com.spotify.music.features.entityselector.pages.tracks.effecthandlers;

import defpackage.c05;
import io.reactivex.functions.g;

/* access modifiers changed from: package-private */
public final class d<T> implements g<c05.a> {
    final /* synthetic */ dz4 a;
    final /* synthetic */ nmf b;

    d(dz4 dz4, nmf nmf) {
        this.a = dz4;
        this.b = nmf;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(c05.a aVar) {
        c05.a aVar2 = aVar;
        this.a.b(aVar2.a().c(), "song page");
        this.b.invoke(aVar2.a());
    }
}
