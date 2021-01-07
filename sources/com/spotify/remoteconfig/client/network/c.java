package com.spotify.remoteconfig.client.network;

import com.spotify.remoteconfig.client.model.resolve.a;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class c<T, R> implements l<T, R> {
    final /* synthetic */ a a;

    c(a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.l
    public Object apply(Object obj) {
        h.f((Boolean) obj, "it");
        return this.a;
    }
}
