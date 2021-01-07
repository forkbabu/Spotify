package com.spotify.music.features.ads.rules;

import com.spotify.music.features.ads.api.e;
import com.spotify.music.features.ads.api.f;

public final class r implements fjf<q> {
    private final wlf<f> a;
    private final wlf<e> b;

    public r(wlf<f> wlf, wlf<e> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q(this.a.get(), this.b.get());
    }
}
