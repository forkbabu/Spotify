package com.spotify.mobile.android.rx;

import io.reactivex.s;

public final class k implements fjf<j> {
    private final wlf<s<Boolean>> a;
    private final wlf<s> b;

    public k(wlf<s<Boolean>> wlf, wlf<s> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a.get(), this.b.get());
    }
}
