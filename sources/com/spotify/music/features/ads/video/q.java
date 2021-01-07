package com.spotify.music.features.ads.video;

import io.reactivex.y;

public final class q implements fjf<p> {
    private final wlf<s> a;
    private final wlf<cqe> b;
    private final wlf<y> c;

    public q(wlf<s> wlf, wlf<cqe> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p(this.a.get(), this.b.get(), this.c);
    }
}
