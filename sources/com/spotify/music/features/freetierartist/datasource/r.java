package com.spotify.music.features.freetierartist.datasource;

public final class r implements fjf<q> {
    private final wlf<h81> a;
    private final wlf<Boolean> b;
    private final wlf<h85> c;
    private final wlf<p> d;
    private final wlf<w> e;

    public r(wlf<h81> wlf, wlf<Boolean> wlf2, wlf<h85> wlf3, wlf<p> wlf4, wlf<w> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q(this.a, this.b.get().booleanValue(), this.c.get(), this.d.get(), this.e.get());
    }
}
