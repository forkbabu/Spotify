package com.spotify.music.libs.fullscreen.story.promo;

public final class h implements fjf<g> {
    private final wlf<a71> a;
    private final wlf<a71> b;

    public h(wlf<a71> wlf, wlf<a71> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get(), this.b.get());
    }
}
