package com.spotify.music.features.podcast.entity.di;

import defpackage.wfc;
import defpackage.zrc;

public final class j0 implements fjf<zrc.a> {
    private final wlf<wfc> a;

    public j0(wlf<wfc> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return zrc.a.a(wfc.a.class, this.a.get());
    }
}
