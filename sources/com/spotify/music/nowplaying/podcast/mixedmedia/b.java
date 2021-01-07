package com.spotify.music.nowplaying.podcast.mixedmedia;

import com.spotify.remoteconfig.a9;

public final class b implements fjf<a> {
    private final wlf<a9> a;

    public b(wlf<a9> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get());
    }
}
