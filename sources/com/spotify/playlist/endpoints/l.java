package com.spotify.playlist.endpoints;

import com.spotify.playlist.endpoints.exceptions.a;

public final class l implements fjf<k> {
    private final wlf<a> a;
    private final wlf<j> b;
    private final wlf<a> c;

    public l(wlf<a> wlf, wlf<j> wlf2, wlf<a> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k(this.a.get(), this.b.get(), this.c.get());
    }
}
