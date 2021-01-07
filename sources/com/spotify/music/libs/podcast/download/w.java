package com.spotify.music.libs.podcast.download;

import com.spotify.mobile.android.util.connectivity.e0;

public final class w implements fjf<v> {
    private final wlf<e0> a;

    public w(wlf<e0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v(this.a.get());
    }
}
