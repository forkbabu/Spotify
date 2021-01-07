package com.spotify.music.nowplayingmini.podcast;

import com.spotify.music.nowplaying.common.view.logging.c;

public final class f implements fjf<d> {
    private final wlf<c> a;

    public f(wlf<c> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get());
    }
}
