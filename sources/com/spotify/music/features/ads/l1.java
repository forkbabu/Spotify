package com.spotify.music.features.ads;

import com.spotify.music.features.ads.api.g;

public final class l1 implements fjf<mv3> {
    private final wlf<g> a;

    public l1(wlf<g> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mv3(this.a.get());
    }
}
