package com.spotify.music.features.freetiertrack;

public final class b implements fjf<a> {
    private final wlf<b61> a;
    private final wlf<e61> b;
    private final wlf<FreeTierTrackFragment> c;
    private final wlf<w51> d;

    public b(wlf<b61> wlf, wlf<e61> wlf2, wlf<FreeTierTrackFragment> wlf3, wlf<w51> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
