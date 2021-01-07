package com.spotify.nowplaying.core.immersive;

public final class d implements fjf<c> {
    private final wlf<f> a;

    public d(wlf<f> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get());
    }
}
