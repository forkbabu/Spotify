package com.spotify.music.features.followfeed.persistence;

import com.google.common.base.Optional;
import com.spotify.music.features.followfeed.persistence.k;
import io.reactivex.functions.l;
import io.reactivex.v;
import kotlin.jvm.internal.h;

final class j<T, R> implements l<Optional<String>, v<? extends Boolean>> {
    final /* synthetic */ k.a a;

    j(k.a aVar) {
        this.a = aVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public v<? extends Boolean> apply(Optional<String> optional) {
        Optional<String> optional2 = optional;
        h.e(optional2, "newestItemViewedId");
        return k.a(this.a.a, optional2.orNull());
    }
}
