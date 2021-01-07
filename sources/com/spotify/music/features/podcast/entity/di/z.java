package com.spotify.music.features.podcast.entity.di;

import com.spotify.music.podcast.entity.adapter.description.f;
import defpackage.zrc;

public final class z implements fjf<zrc.a> {
    private final wlf<f> a;

    public z(wlf<f> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return zrc.a.a(f.a.class, this.a.get());
    }
}
