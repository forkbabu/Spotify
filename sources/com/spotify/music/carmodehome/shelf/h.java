package com.spotify.music.carmodehome.shelf;

import com.spotify.music.navigation.t;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public final class h implements fjf<g> {
    private final wlf<t> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<y> c;
    private final wlf<dr2> d;

    public h(wlf<t> wlf, wlf<g<PlayerState>> wlf2, wlf<y> wlf3, wlf<dr2> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a, this.b, this.c, this.d);
    }
}
