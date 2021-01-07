package com.spotify.music.playlist.permissions;

import com.spotify.ubi.specification.factories.n2;

public final class u implements fjf<t> {
    private final wlf<ere> a;
    private final wlf<n2> b;

    public u(wlf<ere> wlf, wlf<n2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t(this.a.get(), this.b.get());
    }
}
