package com.spotify.music.features.podcast.entity.di;

import defpackage.ohc;
import defpackage.zrc;

public final class b0 implements fjf<zrc.a> {
    private final wlf<ohc> a;

    public b0(wlf<ohc> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return zrc.a.a(ohc.a.class, this.a.get());
    }
}
