package com.spotify.nowplaying.container;

import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class a<T> implements g<cqd> {
    final /* synthetic */ b a;
    final /* synthetic */ c b;

    a(b bVar, c cVar) {
        this.a = bVar;
        this.b = cVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(cqd cqd) {
        cqd cqd2 = cqd;
        b bVar = this.a;
        c cVar = this.b;
        h.d(cqd2, "it");
        b.a(bVar, cVar, cqd2);
    }
}
