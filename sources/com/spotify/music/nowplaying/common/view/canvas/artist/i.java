package com.spotify.music.nowplaying.common.view.canvas.artist;

import com.spotify.music.navigation.t;
import com.spotify.player.model.ContextTrack;
import io.reactivex.g;

public final class i implements fjf<h> {
    private final wlf<g<ContextTrack>> a;
    private final wlf<g<eqd>> b;
    private final wlf<vl2> c;
    private final wlf<pl2> d;
    private final wlf<t> e;

    public i(wlf<g<ContextTrack>> wlf, wlf<g<eqd>> wlf2, wlf<vl2> wlf3, wlf<pl2> wlf4, wlf<t> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static i a(wlf<g<ContextTrack>> wlf, wlf<g<eqd>> wlf2, wlf<vl2> wlf3, wlf<pl2> wlf4, wlf<t> wlf5) {
        return new i(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
