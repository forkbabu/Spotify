package com.spotify.podcast.endpoints;

public final class l0 implements fjf<k0> {
    private final wlf<j0> a;

    public l0(wlf<j0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k0(this.a.get());
    }
}
