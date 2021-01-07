package com.spotify.music.features.podcast.entity.di;

import defpackage.yfc;
import defpackage.zrc;

public final class k0 implements fjf<zrc.a> {
    private final wlf<yfc> a;

    public k0(wlf<yfc> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return zrc.a.a(yfc.a.class, this.a.get());
    }
}
