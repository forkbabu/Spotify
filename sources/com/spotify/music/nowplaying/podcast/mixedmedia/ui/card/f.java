package com.spotify.music.nowplaying.podcast.mixedmedia.ui.card;

import com.spotify.music.nowplaying.podcast.mixedmedia.segments.a;
import io.reactivex.y;

public final class f implements fjf<CurrentTrackPresenterImpl> {
    private final wlf<a> a;
    private final wlf<g> b;
    private final wlf<y> c;

    public f(wlf<a> wlf, wlf<g> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new CurrentTrackPresenterImpl(this.a.get(), this.b.get(), this.c.get());
    }
}
