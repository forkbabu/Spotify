package com.spotify.http.clienttoken;

import com.google.common.base.Optional;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

final class j<T> implements g<Optional<String>> {
    final /* synthetic */ k a;

    j(k kVar) {
        this.a = kVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Optional<String> optional) {
        Optional<String> optional2 = optional;
        k kVar = this.a;
        h.d(optional2, "it");
        k.e(kVar, optional2);
    }
}
