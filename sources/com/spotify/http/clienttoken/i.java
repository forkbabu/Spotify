package com.spotify.http.clienttoken;

import com.google.common.base.Optional;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class i<T, R> implements l<Throwable, Optional<a>> {
    public static final i a = new i();

    i() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Optional<a> apply(Throwable th) {
        h.e(th, "it");
        return Optional.absent();
    }
}
