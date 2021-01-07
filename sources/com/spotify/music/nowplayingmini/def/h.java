package com.spotify.music.nowplayingmini.def;

import com.spotify.music.nowplaying.common.view.logging.c;

public final class h implements fjf<f> {
    private final wlf<c> a;

    public h(wlf<c> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get());
    }
}
