package com.spotify.music.storylines.persistence.database;

import io.reactivex.y;

public final class h implements fjf<g> {
    private final wlf<StorylinesDatabase> a;
    private final wlf<y> b;

    public h(wlf<StorylinesDatabase> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get(), this.b.get());
    }
}
