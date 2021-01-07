package com.spotify.music.podcast.freetierlikes.tabs.followed;

import com.spotify.music.navigation.t;

public final class u implements fjf<t> {
    private final wlf<t> a;

    public u(wlf<t> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t(this.a.get());
    }
}
