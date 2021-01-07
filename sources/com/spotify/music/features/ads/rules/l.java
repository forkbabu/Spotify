package com.spotify.music.features.ads.rules;

import com.spotify.music.features.ads.api.h;

public final class l implements fjf<k> {
    private final wlf<h> a;

    public l(wlf<h> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k(this.a.get());
    }
}
