package com.spotify.nowplaying.core.di;

import com.google.common.base.Optional;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class n<T, R> implements l<Optional<Long>, Long> {
    public static final n a = new n();

    n() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Long apply(Optional<Long> optional) {
        Optional<Long> optional2 = optional;
        h.e(optional2, "it");
        return optional2.get();
    }
}
