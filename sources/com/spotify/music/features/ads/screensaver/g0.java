package com.spotify.music.features.ads.screensaver;

import com.spotify.music.features.ads.p0;

public final class g0 implements fjf<f0> {
    private final wlf<n0> a;
    private final wlf<q0> b;
    private final wlf<nsb> c;
    private final wlf<p0> d;

    public g0(wlf<n0> wlf, wlf<q0> wlf2, wlf<nsb> wlf3, wlf<p0> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f0(this.a, this.b, this.c, this.d);
    }
}
