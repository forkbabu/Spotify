package com.spotify.music.features.editplaylist.operations;

import com.spotify.playlist.endpoints.i;

public final class a0 implements fjf<z> {
    private final wlf<i> a;

    public a0(wlf<i> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z(this.a.get());
    }
}
