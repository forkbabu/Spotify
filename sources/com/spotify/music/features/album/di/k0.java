package com.spotify.music.features.album.di;

import com.spotify.music.libs.viewuri.c;
import com.spotify.ubi.specification.factories.s0;

public final class k0 implements fjf<s0> {
    private final wlf<c> a;

    public k0(wlf<c> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s0(this.a.get().toString());
    }
}
