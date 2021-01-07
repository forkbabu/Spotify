package com.spotify.music.features.podcast.entity.di;

import defpackage.shc;
import defpackage.zrc;

public final class d0 implements fjf<zrc.a> {
    private final wlf<shc> a;

    public d0(wlf<shc> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return zrc.a.a(shc.a.class, this.a.get());
    }
}
