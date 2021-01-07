package com.spotify.music.features.freetierartist;

public final class o implements fjf<n> {
    private final wlf<b61> a;
    private final wlf<e61> b;

    public o(wlf<b61> wlf, wlf<e61> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n(this.a.get(), this.b.get());
    }
}
