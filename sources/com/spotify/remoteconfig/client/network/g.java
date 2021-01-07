package com.spotify.remoteconfig.client.network;

import io.reactivex.disposables.b;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class g<T> implements io.reactivex.functions.g<b> {
    final /* synthetic */ i a;

    g(i iVar) {
        this.a = iVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(b bVar) {
        h.f(bVar, "it");
        i iVar = this.a;
        iVar.g.getClass();
        iVar.a = System.currentTimeMillis();
    }
}
