package com.spotify.music.newplaying.scroll.container;

import com.google.common.collect.ImmutableList;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import io.reactivex.g;
import io.reactivex.y;

public final class e0 implements fjf<d0> {
    private final wlf<g<ImmutableList<NowPlayingWidget>>> a;
    private final wlf<g0> b;
    private final wlf<y> c;
    private final wlf<y> d;

    public e0(wlf<g<ImmutableList<NowPlayingWidget>>> wlf, wlf<g0> wlf2, wlf<y> wlf3, wlf<y> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d0(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
