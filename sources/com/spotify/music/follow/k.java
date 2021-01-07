package com.spotify.music.follow;

import com.spotify.http.u;

public final class k implements fjf<o> {
    private final wlf<u> a;

    public k(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        o oVar = (o) this.a.get().c(o.class);
        yif.g(oVar, "Cannot return null from a non-@Nullable @Provides method");
        return oVar;
    }
}
