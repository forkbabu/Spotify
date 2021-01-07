package com.spotify.music.features.entityselector.pages.search.effecthandlers;

import defpackage.tz4;
import io.reactivex.functions.g;

/* access modifiers changed from: package-private */
public final class h<T> implements g<tz4.a> {
    final /* synthetic */ dz4 a;
    final /* synthetic */ nmf b;

    h(dz4 dz4, nmf nmf) {
        this.a = dz4;
        this.b = nmf;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(tz4.a aVar) {
        tz4.a aVar2 = aVar;
        this.a.b(aVar2.a().c(), "search page");
        this.b.invoke(aVar2.a());
    }
}
