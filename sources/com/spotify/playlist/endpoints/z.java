package com.spotify.playlist.endpoints;

import com.spotify.playlist.endpoints.exceptions.a;

public final class z implements fjf<x> {
    private final wlf<a> a;
    private final wlf<w> b;
    private final wlf<a> c;

    public z(wlf<a> wlf, wlf<w> wlf2, wlf<a> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new x(this.a.get(), this.b.get(), this.c.get());
    }
}
