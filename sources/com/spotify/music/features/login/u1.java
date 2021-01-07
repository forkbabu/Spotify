package com.spotify.music.features.login;

public final class u1 implements fjf<t1> {
    private final wlf<xhd> a;
    private final wlf<ere> b;

    public u1(wlf<xhd> wlf, wlf<ere> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t1(this.a.get(), this.b.get());
    }
}
