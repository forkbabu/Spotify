package com.spotify.music.nowplaying.podcast.sleeptimer;

import com.spotify.music.sleeptimer.n;
import io.reactivex.g;
import io.reactivex.y;

public final class f implements fjf<e> {
    private final wlf<g<String>> a;
    private final wlf<n> b;
    private final wlf<d> c;
    private final wlf<c2c> d;
    private final wlf<y> e;

    public f(wlf<g<String>> wlf, wlf<n> wlf2, wlf<d> wlf3, wlf<c2c> wlf4, wlf<y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
