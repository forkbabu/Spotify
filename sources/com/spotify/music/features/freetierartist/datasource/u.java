package com.spotify.music.features.freetierartist.datasource;

public final class u implements fjf<t> {
    private final wlf<a8a> a;
    private final wlf<c0> b;

    public u(wlf<a8a> wlf, wlf<c0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t(this.a, this.b);
    }
}
