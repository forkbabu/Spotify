package com.spotify.music.features.charts;

import androidx.lifecycle.n;

public final class e implements fjf<ChartsHubsViewBinder> {
    private final wlf<b61> a;
    private final wlf<e61> b;
    private final wlf<w51> c;
    private final wlf<n> d;

    public e(wlf<b61> wlf, wlf<e61> wlf2, wlf<w51> wlf3, wlf<n> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ChartsHubsViewBinder(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
