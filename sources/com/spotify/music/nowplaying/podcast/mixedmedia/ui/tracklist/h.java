package com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist;

import com.spotify.music.nowplaying.podcast.mixedmedia.segments.a;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.contextmenu.c;
import io.reactivex.y;

public final class h implements fjf<TrackListPresenterImpl> {
    private final wlf<a> a;
    private final wlf<y> b;
    private final wlf<i> c;
    private final wlf<c> d;
    private final wlf<com.spotify.music.nowplaying.podcast.mixedmedia.player.a> e;
    private final wlf<f1c> f;

    public h(wlf<a> wlf, wlf<y> wlf2, wlf<i> wlf3, wlf<c> wlf4, wlf<com.spotify.music.nowplaying.podcast.mixedmedia.player.a> wlf5, wlf<f1c> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new TrackListPresenterImpl(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
