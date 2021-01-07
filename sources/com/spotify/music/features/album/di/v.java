package com.spotify.music.features.album.di;

import com.spotify.android.flags.c;

public final class v implements fjf<Boolean> {
    private final wlf<c> a;

    public v(wlf<c> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(z42.x(this.a.get()));
    }
}
