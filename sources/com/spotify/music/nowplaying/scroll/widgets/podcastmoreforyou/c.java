package com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou;

import com.spotify.remoteconfig.c9;

public final class c implements fjf<b> {
    private final wlf<c9> a;

    public c(wlf<c9> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get());
    }
}
