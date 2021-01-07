package com.spotify.music.carmode.nowplaying.podcast.view.speedbutton;

import io.reactivex.s;
import io.reactivex.y;

public final class e implements fjf<d> {
    private final wlf<s<Integer>> a;
    private final wlf<sq2> b;
    private final wlf<nq2> c;
    private final wlf<s<Integer>> d;
    private final wlf<y> e;

    public e(wlf<s<Integer>> wlf, wlf<sq2> wlf2, wlf<nq2> wlf3, wlf<s<Integer>> wlf4, wlf<y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
