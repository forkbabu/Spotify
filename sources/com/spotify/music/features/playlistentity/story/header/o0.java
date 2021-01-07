package com.spotify.music.features.playlistentity.story.header;

import com.spotify.music.features.playlistentity.w;
import com.spotify.playlist.endpoints.v;
import io.reactivex.y;
import io.reactivex.z;

public final class o0 implements fjf<n0> {
    private final wlf<vfa> a;
    private final wlf<h0> b;
    private final wlf<v> c;
    private final wlf<k0> d;
    private final wlf<w> e;
    private final wlf<String> f;
    private final wlf<y> g;
    private final wlf<y> h;
    private final wlf<g0> i;
    private final wlf<Integer> j;
    private final wlf<z<p62>> k;

    public o0(wlf<vfa> wlf, wlf<h0> wlf2, wlf<v> wlf3, wlf<k0> wlf4, wlf<w> wlf5, wlf<String> wlf6, wlf<y> wlf7, wlf<y> wlf8, wlf<g0> wlf9, wlf<Integer> wlf10, wlf<z<p62>> wlf11) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
        this.k = wlf11;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }
}
