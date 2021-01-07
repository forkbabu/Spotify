package com.spotify.music.nowplaying.common.view.contextmenu;

import android.content.Context;
import com.spotify.player.model.PlayerState;
import com.spotify.player.options.d;
import com.spotify.rxjava2.q;
import io.reactivex.g;

public final class v implements fjf<u> {
    private final wlf<Context> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<d> c;
    private final wlf<nqd> d;
    private final wlf<q> e;

    public v(wlf<Context> wlf, wlf<g<PlayerState>> wlf2, wlf<d> wlf3, wlf<nqd> wlf4, wlf<q> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static v a(wlf<Context> wlf, wlf<g<PlayerState>> wlf2, wlf<d> wlf3, wlf<nqd> wlf4, wlf<q> wlf5) {
        return new v(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
