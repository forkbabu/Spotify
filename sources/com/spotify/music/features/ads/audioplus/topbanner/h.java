package com.spotify.music.features.ads.audioplus.topbanner;

import com.spotify.music.features.ads.audioplus.d;
import com.spotify.music.navigation.t;

public final class h implements fjf<g> {
    private final wlf<jp3> a;
    private final wlf<mo3> b;
    private final wlf<so3> c;
    private final wlf<d> d;
    private final wlf<dv3> e;
    private final wlf<t> f;
    private final wlf<an3> g;

    public h(wlf<jp3> wlf, wlf<mo3> wlf2, wlf<so3> wlf3, wlf<d> wlf4, wlf<dv3> wlf5, wlf<t> wlf6, wlf<an3> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get(), this.b, this.c, this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
