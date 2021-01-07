package com.spotify.music.features.followfeed.mobius.effecthandlers;

import com.spotify.music.features.followfeed.a;

public final class m implements fjf<k> {
    private final wlf<a> a;
    private final wlf<com.spotify.music.features.followfeed.persistence.a> b;

    public m(wlf<a> wlf, wlf<com.spotify.music.features.followfeed.persistence.a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k(this.a.get(), this.b.get());
    }
}
