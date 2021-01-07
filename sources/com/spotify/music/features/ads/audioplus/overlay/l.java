package com.spotify.music.features.ads.audioplus.overlay;

import com.spotify.music.features.ads.audioplus.overlay.brandads.r;
import com.spotify.music.features.ads.audioplus.overlay.brandads.t;

public final class l implements fjf<k> {
    private final wlf<t> a;
    private final wlf<r> b;
    private final wlf<ym3> c;
    private final wlf<fn3> d;
    private final wlf<fm3> e;
    private final wlf<jp3> f;

    public l(wlf<t> wlf, wlf<r> wlf2, wlf<ym3> wlf3, wlf<fn3> wlf4, wlf<fm3> wlf5, wlf<jp3> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k(this.a, this.b, this.c, this.d, this.e, this.f.get());
    }
}
