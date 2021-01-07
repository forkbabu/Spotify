package com.spotify.music.libs.connect;

import com.spotify.music.container.app.foregroundstate.d;

public final class h implements fjf<g> {
    private final wlf<d> a;

    public h(wlf<d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get());
    }
}
