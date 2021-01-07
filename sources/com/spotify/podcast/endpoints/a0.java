package com.spotify.podcast.endpoints;

public final class a0 implements fjf<z> {
    private final wlf<y> a;
    private final wlf<u> b;

    public a0(wlf<y> wlf, wlf<u> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z(this.a.get(), this.b.get());
    }
}
