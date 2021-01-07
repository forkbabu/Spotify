package com.spotify.music.features.podcast.entity.di;

import com.spotify.instrumentation.a;
import com.spotify.ubi.specification.factories.q2;

public final class g implements fjf<q2> {
    private final wlf<a> a;

    public g(wlf<a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q2(this.a.get().path());
    }
}
