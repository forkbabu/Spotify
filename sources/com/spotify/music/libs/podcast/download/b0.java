package com.spotify.music.libs.podcast.download;

import com.spotify.music.navigation.t;

public final class b0 implements fjf<a0> {
    private final wlf<y> a;
    private final wlf<t> b;

    public b0(wlf<y> wlf, wlf<t> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a0(this.a.get(), this.b.get());
    }
}
