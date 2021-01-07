package com.spotify.music.features.ads.video;

public final class k implements fjf<j> {
    private final wlf<dv3> a;
    private final wlf<xr3> b;
    private final wlf<p> c;

    public k(wlf<dv3> wlf, wlf<xr3> wlf2, wlf<p> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a, this.b, this.c.get());
    }
}
