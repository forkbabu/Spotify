package com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar;

import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a;
import io.reactivex.y;

public final class b implements fjf<ControlBarPresenter> {
    private final wlf<a> a;
    private final wlf<y> b;
    private final wlf<com.spotify.music.nowplaying.podcast.mixedmedia.player.a> c;
    private final wlf<a1c> d;

    public b(wlf<a> wlf, wlf<y> wlf2, wlf<com.spotify.music.nowplaying.podcast.mixedmedia.player.a> wlf3, wlf<a1c> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ControlBarPresenter(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
