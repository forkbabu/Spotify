package com.spotify.music.features.ads.audioplus.topbanner.carousel;

import com.spotify.music.navigation.t;

public final class c implements fjf<b> {
    private final wlf<on3> a;
    private final wlf<qn3> b;
    private final wlf<t> c;

    public c(wlf<on3> wlf, wlf<qn3> wlf2, wlf<t> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a, this.b, this.c);
    }
}
