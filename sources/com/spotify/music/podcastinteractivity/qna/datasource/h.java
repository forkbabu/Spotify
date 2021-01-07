package com.spotify.music.podcastinteractivity.qna.datasource;

import io.reactivex.y;

public final class h implements fjf<c> {
    private final wlf<y> a;
    private final wlf<y> b;
    private final wlf<y> c;
    private final wlf<jvc> d;
    private final wlf<j> e;
    private final wlf<vuc> f;

    public h(wlf<y> wlf, wlf<y> wlf2, wlf<y> wlf3, wlf<jvc> wlf4, wlf<j> wlf5, wlf<vuc> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
