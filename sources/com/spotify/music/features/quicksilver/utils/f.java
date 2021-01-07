package com.spotify.music.features.quicksilver.utils;

import com.spotify.music.container.app.foregroundstate.d;

public final class f implements fjf<e> {
    private final wlf<d> a;

    public f(wlf<d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get());
    }
}
