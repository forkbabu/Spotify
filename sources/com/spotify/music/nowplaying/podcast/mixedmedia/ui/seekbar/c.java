package com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar;

import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a;
import defpackage.k1c;
import io.reactivex.y;

public final class c implements fjf<SegmentSeekBarPresenter> {
    private final wlf<k1c.a> a;
    private final wlf<y> b;
    private final wlf<a> c;

    public c(wlf<k1c.a> wlf, wlf<y> wlf2, wlf<a> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new SegmentSeekBarPresenter(this.a.get(), this.b.get(), this.c.get());
    }
}
