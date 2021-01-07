package com.spotify.music.features.podcast.entity.presentation;

import com.spotify.music.features.podcast.entity.presentation.u;

public final class v implements fjf<u> {
    private final wlf<j> a;
    private final wlf<u.a> b;
    private final wlf<Boolean> c;
    private final wlf<c> d;

    public v(wlf<j> wlf, wlf<u.a> wlf2, wlf<Boolean> wlf3, wlf<c> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u(this.a.get(), ejf.a(this.b), this.c.get().booleanValue(), this.d.get());
    }
}
