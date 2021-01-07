package com.spotify.music.superbird.setup.domain;

import com.spotify.music.superbird.setup.domain.f;
import com.spotify.superbird.ota.model.g;
import io.reactivex.functions.l;

/* access modifiers changed from: package-private */
public final class h<T, R> implements l<com.spotify.superbird.ota.model.h, f> {
    final /* synthetic */ n a;

    h(n nVar) {
        this.a = nVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public f apply(com.spotify.superbird.ota.model.h hVar) {
        com.spotify.superbird.ota.model.h hVar2 = hVar;
        kotlin.jvm.internal.h.e(hVar2, "response");
        if (hVar2.d().isEmpty()) {
            String c = hVar2.c();
            kotlin.jvm.internal.h.d(c, "response.serial()");
            return new f.p(c);
        }
        g gVar = hVar2.d().get(0);
        String c2 = hVar2.c();
        kotlin.jvm.internal.h.d(c2, "response.serial()");
        kotlin.jvm.internal.h.d(gVar, "updatableItem");
        return new f.a0(c2, gVar, hVar2.b(), this.a.f.g(hVar2.c(), gVar));
    }
}
