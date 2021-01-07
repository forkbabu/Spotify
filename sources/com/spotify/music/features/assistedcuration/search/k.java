package com.spotify.music.features.assistedcuration.search;

import com.spotify.remoteconfig.g5;

public final class k implements fjf<j> {
    private final wlf<g5> a;

    public k(wlf<g5> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a.get());
    }
}
