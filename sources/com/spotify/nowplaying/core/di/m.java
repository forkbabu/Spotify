package com.spotify.nowplaying.core.di;

import com.google.common.base.Optional;
import io.reactivex.functions.n;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class m<T> implements n<Optional<Long>> {
    public static final m a = new m();

    m() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.n
    public boolean test(Optional<Long> optional) {
        Optional<Long> optional2 = optional;
        h.e(optional2, "it");
        return optional2.isPresent();
    }
}
