package com.spotify.music.features.topic;

public final class b implements fjf<a> {
    private final wlf<b61> a;
    private final wlf<e61> b;
    private final wlf<w51> c;

    public b(wlf<b61> wlf, wlf<e61> wlf2, wlf<w51> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.b.get(), this.c.get());
    }
}
