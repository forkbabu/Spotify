package com.spotify.imageresolve;

public final class z implements fjf<y> {
    private final wlf<h0> a;
    private final wlf<s> b;

    public z(wlf<h0> wlf, wlf<s> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new y(this.a.get(), this.b.get());
    }
}
