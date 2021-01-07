package com.spotify.music.nowplaying.common.view.contextmenu;

import com.spotify.music.nowplaying.common.view.share.c;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class m implements fjf<l> {
    private final wlf<g<PlayerState>> a;
    private final wlf<g<o>> b;
    private final wlf<p> c;
    private final wlf<c> d;
    private final wlf<lqd> e;

    public m(wlf<g<PlayerState>> wlf, wlf<g<o>> wlf2, wlf<p> wlf3, wlf<c> wlf4, wlf<lqd> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static m a(wlf<g<PlayerState>> wlf, wlf<g<o>> wlf2, wlf<p> wlf3, wlf<c> wlf4, wlf<lqd> wlf5) {
        return new m(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
