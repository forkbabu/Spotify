package com.spotify.music.features.podcast.entity.di;

import defpackage.lgc;
import defpackage.zrc;

public final class x implements fjf<zrc.a> {
    private final wlf<lgc> a;

    public x(wlf<lgc> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return zrc.a.a(lgc.a.class, this.a.get());
    }
}
