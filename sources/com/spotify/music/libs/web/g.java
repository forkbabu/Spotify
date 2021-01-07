package com.spotify.music.libs.web;

import io.reactivex.y;

public final class g implements fjf<RxWebToken> {
    private final wlf<h> a;
    private final wlf<y> b;

    public g(wlf<h> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new RxWebToken(this.a.get(), this.b.get());
    }
}
