package com.spotify.music.features.ads.screensaver;

import com.spotify.music.features.ads.audioplus.e;

public final class r0 implements fjf<q0> {
    private final wlf<n0> a;
    private final wlf<jp3> b;
    private final wlf<e> c;

    public r0(wlf<n0> wlf, wlf<jp3> wlf2, wlf<e> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q0(this.a, this.b, this.c);
    }
}
