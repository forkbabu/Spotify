package com.spotify.music.libs.connect;

import com.spotify.libs.connect.h;
import com.spotify.libs.connect.l;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public final class p implements fjf<o> {
    private final wlf<l> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<h> c;
    private final wlf<k4d> d;
    private final wlf<y> e;

    public p(wlf<l> wlf, wlf<g<PlayerState>> wlf2, wlf<h> wlf3, wlf<k4d> wlf4, wlf<y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static p a(wlf<l> wlf, wlf<g<PlayerState>> wlf2, wlf<h> wlf3, wlf<k4d> wlf4, wlf<y> wlf5) {
        return new p(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o(this.a, this.b, this.c, this.d, this.e);
    }
}
