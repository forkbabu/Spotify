package com.spotify.http.wg;

import com.spotify.http.wg.f;

public final class h implements fjf<f> {
    private final wlf<f.a.b> a;

    public h(wlf<f.a.b> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get());
    }
}
