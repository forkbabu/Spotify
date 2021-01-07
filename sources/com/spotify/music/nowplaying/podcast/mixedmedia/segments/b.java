package com.spotify.music.nowplaying.podcast.mixedmedia.segments;

import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position.i;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a;

public final class b implements fjf<EnhancedTrackListModelFlowableHelperImpl> {
    private final wlf<a> a;
    private final wlf<e> b;
    private final wlf<i> c;

    public b(wlf<a> wlf, wlf<e> wlf2, wlf<i> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new EnhancedTrackListModelFlowableHelperImpl(this.a.get(), this.b.get(), this.c.get());
    }
}
