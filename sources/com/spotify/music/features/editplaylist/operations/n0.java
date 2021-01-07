package com.spotify.music.features.editplaylist.operations;

import com.spotify.playlist.endpoints.i;

public final class n0 implements fjf<m0> {
    private final wlf<i> a;

    public n0(wlf<i> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m0(this.a.get());
    }
}
