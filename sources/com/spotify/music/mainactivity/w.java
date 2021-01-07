package com.spotify.music.mainactivity;

import com.spotify.music.features.ads.screensaver.f0;

public final class w implements fjf<v> {
    private final wlf<f0> a;

    public w(wlf<f0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v(this.a.get());
    }
}
