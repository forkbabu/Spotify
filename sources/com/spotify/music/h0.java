package com.spotify.music;

public final class h0 implements fjf<g0> {
    private final wlf<bhb> a;

    public h0(wlf<bhb> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g0(this.a.get());
    }
}
