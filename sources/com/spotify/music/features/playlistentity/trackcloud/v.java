package com.spotify.music.features.playlistentity.trackcloud;

import android.content.Context;

public final class v implements fjf<Boolean> {
    private final wlf<Context> a;

    public v(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(nud.m(this.a.get()));
    }
}
