package com.spotify.music.features.ads.video;

public final class n implements fjf<m> {
    private final wlf<cqe> a;
    private final wlf<dv3> b;
    private final wlf<xr3> c;
    private final wlf<p> d;

    public n(wlf<cqe> wlf, wlf<dv3> wlf2, wlf<xr3> wlf3, wlf<p> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m(this.a, this.b, this.c, this.d.get());
    }
}
