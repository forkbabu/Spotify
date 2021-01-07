package com.spotify.imageresolve;

public final class u implements fjf<t> {
    private final wlf<r> a;

    public u(wlf<r> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t(this.a.get());
    }
}
