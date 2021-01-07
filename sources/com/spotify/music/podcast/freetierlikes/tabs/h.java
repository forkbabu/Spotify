package com.spotify.music.podcast.freetierlikes.tabs;

import com.spotify.music.navigation.o;

public final class h implements fjf<g> {
    private final wlf<o> a;
    private final wlf<i> b;

    public h(wlf<o> wlf, wlf<i> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get(), this.b.get());
    }
}
