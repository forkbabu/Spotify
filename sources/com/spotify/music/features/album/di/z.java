package com.spotify.music.features.album.di;

import com.spotify.http.u;

public final class z implements fjf<vv3> {
    private final wlf<u> a;

    public z(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        vv3 vv3 = (vv3) this.a.get().c(vv3.class);
        yif.g(vv3, "Cannot return null from a non-@Nullable @Provides method");
        return vv3;
    }
}
