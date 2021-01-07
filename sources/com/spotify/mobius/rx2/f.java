package com.spotify.mobius.rx2;

import com.spotify.mobius.rx2.h;
import io.reactivex.functions.l;

class f implements l<F, E> {
    f(h.a aVar) {
    }

    @Override // io.reactivex.functions.l
    public E apply(F f) {
        throw new UnknownEffectException(f);
    }
}
