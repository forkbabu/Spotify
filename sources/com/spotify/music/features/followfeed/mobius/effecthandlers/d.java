package com.spotify.music.features.followfeed.mobius.effecthandlers;

import com.spotify.music.features.followfeed.network.a;

public final class d implements fjf<c> {
    private final wlf<a> a;

    public d(wlf<a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get());
    }
}