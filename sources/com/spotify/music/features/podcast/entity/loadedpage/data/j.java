package com.spotify.music.features.podcast.entity.loadedpage.data;

import io.reactivex.y;

public final class j implements fjf<i> {
    private final wlf<o27> a;
    private final wlf<pnc> b;
    private final wlf<txc> c;
    private final wlf<y> d;

    public j(wlf<o27> wlf, wlf<pnc> wlf2, wlf<txc> wlf3, wlf<y> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
