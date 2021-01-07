package com.spotify.music.features.charts;

public final class g implements fjf<ChartsPresenter> {
    private final wlf<d> a;

    public g(wlf<d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ChartsPresenter(this.a.get());
    }
}
