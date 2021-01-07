package com.spotify.music.features.spoton;

import com.spotify.music.genie.p;
import io.reactivex.y;

public final class r implements fjf<q> {
    private final wlf<p> a;
    private final wlf<y> b;
    private final wlf<y> c;
    private final wlf<m> d;
    private final wlf<pea> e;

    public r(wlf<p> wlf, wlf<y> wlf2, wlf<y> wlf3, wlf<m> wlf4, wlf<pea> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q(this.a, this.b, this.c, this.d, this.e);
    }
}
