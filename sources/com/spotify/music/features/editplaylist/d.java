package com.spotify.music.features.editplaylist;

import com.spotify.remoteconfig.q5;

public final class d implements fjf<c> {
    private final wlf<q5> a;

    public d(wlf<q5> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get());
    }
}
