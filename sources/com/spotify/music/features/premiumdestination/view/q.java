package com.spotify.music.features.premiumdestination.view;

public final class q implements fjf<p> {
    private final wlf<f> a;
    private final wlf<h> b;

    public q(wlf<f> wlf, wlf<h> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p(this.a.get(), this.b.get());
    }
}
