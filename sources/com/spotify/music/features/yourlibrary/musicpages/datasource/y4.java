package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.music.playlist.synchronizer.d;

public final class y4 implements fjf<x4> {
    private final wlf<d> a;

    public y4(wlf<d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new x4(this.a.get());
    }
}
