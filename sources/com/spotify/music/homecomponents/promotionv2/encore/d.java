package com.spotify.music.homecomponents.promotionv2.encore;

public final class d implements fjf<c> {
    private final wlf<vp9> a;
    private final wlf<a71> b;

    public d(wlf<vp9> wlf, wlf<a71> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get());
    }
}
