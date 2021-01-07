package com.spotify.smartlock.store;

public final class h implements fjf<g> {
    private final wlf<f> a;

    public h(wlf<f> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get());
    }
}
