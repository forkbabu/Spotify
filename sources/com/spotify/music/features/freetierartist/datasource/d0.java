package com.spotify.music.features.freetierartist.datasource;

import com.spotify.music.follow.m;

public final class d0 implements fjf<c0> {
    private final wlf<m> a;

    public d0(wlf<m> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c0(this.a.get());
    }
}
