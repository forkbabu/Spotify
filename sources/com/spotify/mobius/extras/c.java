package com.spotify.mobius.extras;

import com.spotify.mobius.g;
import com.spotify.mobius.h;

public final class c<T, R> implements g<T, R> {
    private final ea2<da2<R>, h<T>> a;

    private c(ea2<da2<R>, h<T>> ea2) {
        this.a = ea2;
    }

    public static <T, R> g<T, R> a(ea2<da2<R>, h<T>> ea2) {
        return new c(ea2);
    }

    @Override // com.spotify.mobius.g
    public h<T> t(da2<R> da2) {
        return this.a.apply(da2);
    }
}
