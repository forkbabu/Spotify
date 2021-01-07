package com.spotify.libs.album;

import com.spotify.http.u;

public final class b implements fjf<a> {
    private final wlf<u> a;

    public b(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        a aVar = (a) this.a.get().c(a.class);
        yif.g(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }
}
