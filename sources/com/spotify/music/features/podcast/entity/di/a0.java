package com.spotify.music.features.podcast.entity.di;

import com.spotify.music.podcast.entity.adapter.episoderow.d;
import defpackage.zrc;

public final class a0 implements fjf<zrc.a> {
    private final wlf<d> a;

    public a0(wlf<d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return zrc.a.a(d.a.class, this.a.get());
    }
}
