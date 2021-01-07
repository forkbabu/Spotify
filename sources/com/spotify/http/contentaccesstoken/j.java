package com.spotify.http.contentaccesstoken;

import com.google.common.base.Optional;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class j<T, R> implements l<Throwable, Optional<d>> {
    public static final j a = new j();

    j() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Optional<d> apply(Throwable th) {
        h.e(th, "it");
        return Optional.absent();
    }
}
