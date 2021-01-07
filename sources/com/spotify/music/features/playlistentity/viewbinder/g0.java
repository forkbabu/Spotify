package com.spotify.music.features.playlistentity.viewbinder;

import com.spotify.music.features.playlistentity.j;

public final class g0 implements fjf<f0> {
    private final wlf<j> a;

    public g0(wlf<j> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f0(this.a.get());
    }
}
