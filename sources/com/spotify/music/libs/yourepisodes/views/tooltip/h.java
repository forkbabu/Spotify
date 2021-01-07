package com.spotify.music.libs.yourepisodes.views.tooltip;

public final class h implements fjf<g> {
    private final wlf<lbb> a;
    private final wlf<k> b;
    private final wlf<a> c;
    private final wlf<n> d;

    public h(wlf<lbb> wlf, wlf<k> wlf2, wlf<a> wlf3, wlf<n> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
