package com.spotify.music.podcast.player.trailer.impl;

import com.spotify.player.queue.f;

public final class e implements fjf<PlayerApiQueueComposer> {
    private final wlf<f> a;

    public e(wlf<f> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PlayerApiQueueComposer(this.a.get());
    }
}
