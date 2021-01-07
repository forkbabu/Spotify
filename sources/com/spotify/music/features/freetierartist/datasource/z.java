package com.spotify.music.features.freetierartist.datasource;

public final class z implements fjf<y> {
    private final wlf<o75> a;
    private final wlf<x9a> b;

    public z(wlf<o75> wlf, wlf<x9a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new y(this.a.get(), this.b.get());
    }
}
