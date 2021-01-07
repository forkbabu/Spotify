package com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause;

import com.spotify.music.nowplaying.podcast.mixedmedia.player.a;
import io.reactivex.g;
import io.reactivex.y;

public final class c implements fjf<DurationPlayPauseButtonPresenterImpl> {
    private final wlf<d> a;
    private final wlf<a> b;
    private final wlf<com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a> c;
    private final wlf<g<Boolean>> d;
    private final wlf<y> e;
    private final wlf<g<String>> f;
    private final wlf<a1c> g;

    public c(wlf<d> wlf, wlf<a> wlf2, wlf<com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a> wlf3, wlf<g<Boolean>> wlf4, wlf<y> wlf5, wlf<g<String>> wlf6, wlf<a1c> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new DurationPlayPauseButtonPresenterImpl(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
