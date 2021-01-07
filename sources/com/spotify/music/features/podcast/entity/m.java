package com.spotify.music.features.podcast.entity;

import com.spotify.music.spotlets.scannables.c;

public final class m implements fjf<l> {
    private final wlf<c> a;

    public m(wlf<c> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a.get());
    }
}
