package com.spotify.music.podcast.entity.adapter.episoderow;

import com.spotify.music.podcast.entity.adapter.episoderow.i;

public final class e implements fjf<d> {
    private final wlf<i.a> a;

    public e(wlf<i.a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get());
    }
}
