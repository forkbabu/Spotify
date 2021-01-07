package com.spotify.music.features.album.encore;

import com.spotify.ubi.specification.factories.l;

public final class n implements fjf<m> {
    private final wlf<ere> a;
    private final wlf<l> b;

    public n(wlf<ere> wlf, wlf<l> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m(this.a.get(), this.b.get());
    }
}
