package com.spotify.music.features.login;

import com.spotify.http.g;

public final class h1 implements fjf<g1> {
    private final wlf<g> a;
    private final wlf<u2a> b;

    public h1(wlf<g> wlf, wlf<u2a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static g1 a(g gVar, u2a u2a) {
        return new g1(gVar, u2a);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g1(this.a.get(), this.b.get());
    }
}
