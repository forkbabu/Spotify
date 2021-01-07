package com.spotify.playlist.endpoints;

import com.spotify.playlist.endpoints.exceptions.a;

public final class s implements fjf<r> {
    private final wlf<q> a;
    private final wlf<a> b;

    public s(wlf<q> wlf, wlf<a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r(this.a.get(), this.b.get());
    }
}
