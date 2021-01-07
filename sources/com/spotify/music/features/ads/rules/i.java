package com.spotify.music.features.ads.rules;

public final class i implements fjf<h> {
    private final wlf<m> a;
    private final wlf<q> b;
    private final wlf<k> c;

    public i(wlf<m> wlf, wlf<q> wlf2, wlf<k> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get(), this.c.get());
    }
}
