package com.spotify.music.features.podcast.entity.presentation;

import com.spotify.music.podcast.entity.adapter.episoderow.k;

public final class m implements fjf<l> {
    private final wlf<Boolean> a;
    private final wlf<Boolean> b;
    private final wlf<k> c;

    public m(wlf<Boolean> wlf, wlf<Boolean> wlf2, wlf<k> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a.get().booleanValue(), this.b.get().booleanValue(), this.c.get());
    }
}
