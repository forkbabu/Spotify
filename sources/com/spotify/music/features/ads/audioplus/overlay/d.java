package com.spotify.music.features.ads.audioplus.overlay;

import com.spotify.music.navigation.t;

public final class d implements fjf<c> {
    private final wlf<k> a;
    private final wlf<com.spotify.music.features.ads.audioplus.d> b;
    private final wlf<dv3> c;
    private final wlf<t> d;
    private final wlf<an3> e;

    public d(wlf<k> wlf, wlf<com.spotify.music.features.ads.audioplus.d> wlf2, wlf<dv3> wlf3, wlf<t> wlf4, wlf<an3> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
