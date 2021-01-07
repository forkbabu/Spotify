package com.spotify.mobile.android.service;

import java.util.Random;

public final class n implements fjf<m> {
    private final wlf<cqe> a;
    private final wlf<Random> b;

    public n(wlf<cqe> wlf, wlf<Random> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m(this.a.get(), this.b.get());
    }
}
