package com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.segments;

import android.content.Context;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position.i;
import io.reactivex.g;

public final class c implements fjf<b> {
    private final wlf<Context> a;
    private final wlf<q1c> b;
    private final wlf<i> c;
    private final wlf<g<com.spotify.music.nowplaying.podcast.mixedmedia.model.c>> d;
    private final wlf<n1c> e;

    public c(wlf<Context> wlf, wlf<q1c> wlf2, wlf<i> wlf3, wlf<g<com.spotify.music.nowplaying.podcast.mixedmedia.model.c>> wlf4, wlf<n1c> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
