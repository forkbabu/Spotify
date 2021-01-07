package com.spotify.podcast.endpoints;

public final class f0 implements fjf<e0> {
    private final wlf<d0> a;
    private final wlf<u> b;

    public f0(wlf<d0> wlf, wlf<u> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e0(this.a.get(), this.b.get());
    }
}
