package com.spotify.music.libs.connect.access.animation.logic;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;

public final class c implements fjf<NudgeResolver> {
    private final wlf<s<Boolean>> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<y> c;

    public c(wlf<s<Boolean>> wlf, wlf<g<PlayerState>> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new NudgeResolver(this.a.get(), this.b.get(), this.c.get());
    }
}
