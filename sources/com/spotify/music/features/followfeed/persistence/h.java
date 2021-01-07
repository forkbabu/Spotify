package com.spotify.music.features.followfeed.persistence;

import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.z;

/* access modifiers changed from: package-private */
public final class h<T, R> implements l<Throwable, d0<? extends Boolean>> {
    public static final h a = new h();

    h() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public d0<? extends Boolean> apply(Throwable th) {
        kotlin.jvm.internal.h.e(th, "it");
        return z.z(Boolean.FALSE);
    }
}
