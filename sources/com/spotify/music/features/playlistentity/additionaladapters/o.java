package com.spotify.music.features.playlistentity.additionaladapters;

import io.reactivex.y;

public final class o implements fjf<n> {
    private final wlf<y> a;

    public o(wlf<y> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n(this.a);
    }
}
