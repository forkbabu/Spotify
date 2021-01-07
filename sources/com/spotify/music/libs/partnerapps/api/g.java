package com.spotify.music.libs.partnerapps.api;

import com.spotify.http.u;

public final class g implements fjf<f> {
    private final wlf<u> a;

    public g(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get());
    }
}
