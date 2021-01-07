package com.spotify.music.features.editplaylist.operations;

import com.spotify.playlist.endpoints.i;

public final class x implements fjf<w> {
    private final wlf<i> a;

    public x(wlf<i> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w(this.a.get());
    }
}
