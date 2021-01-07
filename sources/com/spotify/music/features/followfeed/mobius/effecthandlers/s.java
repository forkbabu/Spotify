package com.spotify.music.features.followfeed.mobius.effecthandlers;

import com.spotify.music.navigation.t;

public final class s implements fjf<r> {
    private final wlf<t> a;

    public s(wlf<t> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r(this.a.get());
    }
}
