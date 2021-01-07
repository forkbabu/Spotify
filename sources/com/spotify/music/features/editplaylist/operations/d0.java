package com.spotify.music.features.editplaylist.operations;

import com.spotify.playlist.endpoints.i;

public final class d0 implements fjf<c0> {
    private final wlf<i> a;

    public d0(wlf<i> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c0(this.a.get());
    }
}
