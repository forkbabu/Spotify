package com.spotify.music.features.podcast.entity.presentation;

public final class r implements fjf<q> {
    private final wlf<yhc> a;
    private final wlf<t8a> b;
    private final wlf<tna> c;
    private final wlf<v57> d;
    private final wlf<Boolean> e;

    public r(wlf<yhc> wlf, wlf<t8a> wlf2, wlf<tna> wlf3, wlf<v57> wlf4, wlf<Boolean> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get().booleanValue());
    }
}
