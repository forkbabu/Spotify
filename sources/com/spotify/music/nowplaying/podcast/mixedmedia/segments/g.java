package com.spotify.music.nowplaying.podcast.mixedmedia.segments;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.nowplaying.podcast.mixedmedia.player.f;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a;

public final class g implements fjf<TrackListStateFlowableHelperImpl> {
    private final wlf<a> a;
    private final wlf<f> b;
    private final wlf<CollectionStateProvider> c;

    public g(wlf<a> wlf, wlf<f> wlf2, wlf<CollectionStateProvider> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new TrackListStateFlowableHelperImpl(this.a.get(), this.b.get(), this.c.get());
    }
}
