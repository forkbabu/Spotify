package com.spotify.music.nowplaying.common.view.share;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class f implements fjf<e> {
    private final wlf<g<PlayerState>> a;
    private final wlf<asb> b;
    private final wlf<jzc> c;
    private final wlf<drd> d;
    private final wlf<c> e;

    public f(wlf<g<PlayerState>> wlf, wlf<asb> wlf2, wlf<jzc> wlf3, wlf<drd> wlf4, wlf<c> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static f a(wlf<g<PlayerState>> wlf, wlf<asb> wlf2, wlf<jzc> wlf3, wlf<drd> wlf4, wlf<c> wlf5) {
        return new f(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
