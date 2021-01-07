package com.spotify.music.features.ads;

import com.spotify.http.u;

public final class k1 implements fjf<vt3> {
    private final wlf<u> a;

    public k1(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        vt3 vt3 = (vt3) this.a.get().c(vt3.class);
        yif.g(vt3, "Cannot return null from a non-@Nullable @Provides method");
        return vt3;
    }
}
