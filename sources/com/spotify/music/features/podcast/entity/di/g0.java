package com.spotify.music.features.podcast.entity.di;

import defpackage.zhc;
import defpackage.zrc;

public final class g0 implements fjf<zrc.a> {
    private final wlf<zhc> a;

    public g0(wlf<zhc> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return zrc.a.a(zhc.a.class, this.a.get());
    }
}
