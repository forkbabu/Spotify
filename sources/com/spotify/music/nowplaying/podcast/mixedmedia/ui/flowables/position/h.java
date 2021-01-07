package com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position;

import android.content.Context;

public final class h implements fjf<g> {
    private final wlf<Context> a;

    public h(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get());
    }
}
