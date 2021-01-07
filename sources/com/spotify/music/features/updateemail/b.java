package com.spotify.music.features.updateemail;

import com.spotify.remoteconfig.gk;

public final class b implements fjf<a> {
    private final wlf<gk> a;

    public b(wlf<gk> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get());
    }
}
