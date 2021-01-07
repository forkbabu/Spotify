package com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position;

import io.reactivex.g;

public final class d implements fjf<PlaybackPositionFlowableHelperImpl> {
    private final wlf<g<Long>> a;
    private final wlf<n1c> b;
    private final wlf<i> c;

    public d(wlf<g<Long>> wlf, wlf<n1c> wlf2, wlf<i> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PlaybackPositionFlowableHelperImpl(this.a.get(), this.b.get(), this.c.get());
    }
}
