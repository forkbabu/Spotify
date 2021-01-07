package com.spotify.remoteconfig.client.network;

import com.spotify.ucs.proto.v0.UcsResponseWrapper;
import io.reactivex.functions.g;
import retrofit2.v;

/* access modifiers changed from: package-private */
public final class h<T> implements g<v<UcsResponseWrapper>> {
    final /* synthetic */ i a;

    h(i iVar) {
        this.a = iVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(v<UcsResponseWrapper> vVar) {
        v<UcsResponseWrapper> vVar2 = vVar;
        kotlin.jvm.internal.h.f(vVar2, "response");
        if (this.a.j(vVar2) != 200 && this.a.j(vVar2) != 404 && this.a.j(vVar2) != 429) {
            throw new UcsRequestFailedException("UCS request failed!", vVar2);
        }
    }
}
