package com.spotify.mobius.rx2;

import com.spotify.mobius.rx2.h;
import io.reactivex.functions.n;

class g implements n<F> {
    final /* synthetic */ h.a a;

    g(h.a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.n
    public boolean test(F f) {
        for (Class cls : this.a.a) {
            if (cls.isAssignableFrom(f.getClass())) {
                return false;
            }
        }
        return true;
    }
}
