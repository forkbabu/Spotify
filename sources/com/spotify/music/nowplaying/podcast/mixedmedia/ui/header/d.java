package com.spotify.music.nowplaying.podcast.mixedmedia.ui.header;

import com.spotify.music.nowplaying.core.navcontext.f;
import com.spotify.music.nowplaying.podcast.mixedmedia.model.c;
import io.reactivex.g;
import io.reactivex.y;

public final class d implements fjf<c> {
    private final wlf<g<c>> a;
    private final wlf<g<f>> b;
    private final wlf<y> c;

    public d(wlf<g<c>> wlf, wlf<g<f>> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get());
    }
}
