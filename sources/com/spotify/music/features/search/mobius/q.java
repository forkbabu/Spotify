package com.spotify.music.features.search.mobius;

public final class q implements fjf<p> {
    private final wlf<c8b> a;
    private final wlf<z> b;
    private final wlf<j81> c;

    public q(wlf<c8b> wlf, wlf<z> wlf2, wlf<j81> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p(this.a.get(), this.b.get(), this.c.get());
    }
}
