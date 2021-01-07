package com.spotify.music.features.playlistentity.header;

import com.spotify.music.features.playlistentity.w;
import com.spotify.music.navigation.t;
import io.reactivex.y;

public final class t0 implements fjf<s0> {
    private final wlf<o0> a;
    private final wlf<t> b;
    private final wlf<u0> c;
    private final wlf<w> d;
    private final wlf<String> e;
    private final wlf<y> f;
    private final wlf<h0> g;
    private final wlf<k0> h;

    public t0(wlf<o0> wlf, wlf<t> wlf2, wlf<u0> wlf3, wlf<w> wlf4, wlf<String> wlf5, wlf<y> wlf6, wlf<h0> wlf7, wlf<k0> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
