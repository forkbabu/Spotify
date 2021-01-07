package com.spotify.music.podcastentityrow;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.music.libs.viewuri.c;

public final class a0 implements fjf<z> {
    private final wlf<c> a;
    private final wlf<Player> b;
    private final wlf<w> c;

    public a0(wlf<c> wlf, wlf<Player> wlf2, wlf<w> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z(this.a.get(), this.b.get(), this.c.get());
    }
}
