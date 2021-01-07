package com.spotify.nowplaying.ui.components.controls.seekbackward;

import com.spotify.player.controls.d;
import com.spotify.player.model.Restrictions;
import io.reactivex.g;

public final class i implements fjf<h> {
    private final wlf<d> a;
    private final wlf<g<String>> b;
    private final wlf<g<Long>> c;
    private final wlf<g<Restrictions>> d;
    private final wlf<g> e;

    public i(wlf<d> wlf, wlf<g<String>> wlf2, wlf<g<Long>> wlf3, wlf<g<Restrictions>> wlf4, wlf<g> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static i a(wlf<d> wlf, wlf<g<String>> wlf2, wlf<g<Long>> wlf3, wlf<g<Restrictions>> wlf4, wlf<g> wlf5) {
        return new i(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
