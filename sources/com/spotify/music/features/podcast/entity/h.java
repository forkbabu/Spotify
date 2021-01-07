package com.spotify.music.features.podcast.entity;

public final class h implements fjf<g> {
    private final wlf<j> a;
    private final wlf<Boolean> b;
    private final wlf<String> c;

    public h(wlf<j> wlf, wlf<Boolean> wlf2, wlf<String> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get(), this.b.get().booleanValue(), this.c.get());
    }
}
