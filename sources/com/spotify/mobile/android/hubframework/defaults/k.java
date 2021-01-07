package com.spotify.mobile.android.hubframework.defaults;

import com.spotify.music.follow.m;

public final class k implements fjf<j> {
    private final wlf<m> a;

    public k(wlf<m> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a.get());
    }
}
