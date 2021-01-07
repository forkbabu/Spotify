package com.spotify.mobius.rx2;

import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

class e<T, R> implements w<T, R> {
    private final Iterable<w<T, R>> a;

    public e(Iterable<w<T, R>> iterable) {
        this.a = iterable;
    }

    @Override // io.reactivex.w
    public v apply(s sVar) {
        return sVar.t0(new d(this));
    }
}
