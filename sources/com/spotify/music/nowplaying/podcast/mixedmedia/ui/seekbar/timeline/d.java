package com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline;

import com.spotify.music.nowplaying.podcast.mixedmedia.player.a;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position.i;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.f;
import io.reactivex.y;

public final class d implements fjf<b> {
    private final wlf<y> a;
    private final wlf<i> b;
    private final wlf<a> c;
    private final wlf<n1c> d;
    private final wlf<a> e;
    private final wlf<com.spotify.music.nowplaying.podcast.mixedmedia.ui.card.d> f;
    private final wlf<f> g;
    private final wlf<b1c> h;

    public d(wlf<y> wlf, wlf<i> wlf2, wlf<a> wlf3, wlf<n1c> wlf4, wlf<a> wlf5, wlf<com.spotify.music.nowplaying.podcast.mixedmedia.ui.card.d> wlf6, wlf<f> wlf7, wlf<b1c> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
