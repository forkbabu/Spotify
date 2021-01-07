package com.spotify.music.features.podcast.entity.presentation;

import com.spotify.music.podcastentityrow.v;

public final class e implements fjf<d> {
    private final wlf<Boolean> a;
    private final wlf<v> b;

    public e(wlf<Boolean> wlf, wlf<v> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get().booleanValue(), this.b.get());
    }
}
