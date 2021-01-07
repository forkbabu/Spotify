package com.spotify.music.features.yourepisodes.view;

import com.spotify.music.features.yourepisodes.a0;

public final class r implements fjf<q> {
    private final wlf<a0> a;
    private final wlf<k09> b;

    public r(wlf<a0> wlf, wlf<k09> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q(this.a.get(), this.b.get());
    }
}
