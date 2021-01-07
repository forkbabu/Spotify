package com.spotify.music.features.podcast.entity.trailer;

public final class f implements fjf<e> {
    private final wlf<bre> a;
    private final wlf<x57> b;

    public f(wlf<bre> wlf, wlf<x57> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get());
    }
}
