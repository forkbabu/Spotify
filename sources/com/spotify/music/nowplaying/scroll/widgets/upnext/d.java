package com.spotify.music.nowplaying.scroll.widgets.upnext;

import com.spotify.remoteconfig.e9;

public final class d implements fjf<c> {
    private final wlf<e9> a;

    public d(wlf<e9> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get());
    }
}
