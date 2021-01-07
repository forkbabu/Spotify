package com.spotify.mobile.android.rx;

import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;

public final class n implements fjf<s<Boolean>> {
    private final wlf<yn1> a;

    public n(wlf<yn1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v(this.a.get().a().O(h.a));
    }
}
