package com.spotify.music.nowplaying.podcast.mixedmedia.ui.card;

import com.spotify.music.navigation.t;

public final class c implements fjf<b> {
    private final wlf<t> a;

    public c(wlf<t> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get());
    }
}
