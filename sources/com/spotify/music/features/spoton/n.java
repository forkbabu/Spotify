package com.spotify.music.features.spoton;

import com.spotify.mobile.android.service.media.z1;

public final class n implements fjf<m> {
    private final wlf<z1> a;

    public n(wlf<z1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m(this.a.get());
    }
}
