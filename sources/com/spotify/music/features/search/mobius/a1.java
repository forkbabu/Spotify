package com.spotify.music.features.search.mobius;

public final class a1 implements fjf<z0> {
    private final wlf<z> a;
    private final wlf<b0> b;

    public a1(wlf<z> wlf, wlf<b0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z0(this.a, this.b);
    }
}
