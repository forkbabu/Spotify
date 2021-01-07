package com.spotify.music.features.podcast.entity.presentation;

import defpackage.tfc;

public final class t implements fjf<s> {
    private final wlf<tfc.a> a;

    public t(wlf<tfc.a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s(this.a.get());
    }
}
