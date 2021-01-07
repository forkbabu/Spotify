package com.spotify.music.features.podcast.entity.di;

import defpackage.qhc;

public final class c0 implements fjf<qhc.a> {
    private final wlf<oic> a;

    public c0(wlf<oic> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get());
    }
}
