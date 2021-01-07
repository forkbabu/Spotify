package com.spotify.music.behindthelyrics.presenter;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public final class m implements fjf<l> {
    private final wlf<g<PlayerState>> a;
    private final wlf<cqe> b;
    private final wlf<y> c;

    public m(wlf<g<PlayerState>> wlf, wlf<cqe> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a.get(), this.b.get(), this.c.get());
    }
}
