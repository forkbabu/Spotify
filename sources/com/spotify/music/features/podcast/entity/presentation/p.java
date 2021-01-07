package com.spotify.music.features.podcast.entity.presentation;

public final class p implements fjf<o> {
    private final wlf<t8a> a;
    private final wlf<v57> b;

    public p(wlf<t8a> wlf, wlf<v57> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o(this.a.get(), this.b.get());
    }
}
