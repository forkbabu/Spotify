package com.spotify.music.nowplaying.podcast.mixedmedia.ui.speedcontrol;

import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a;
import com.spotify.music.nowplaying.podcast.speedcontrol.e;

public final class b implements fjf<a> {
    private final wlf<e> a;
    private final wlf<a> b;

    public b(wlf<e> wlf, wlf<a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.b.get());
    }
}
