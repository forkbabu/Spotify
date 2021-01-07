package com.spotify.music.libs.mediasession;

import com.spotify.player.model.PlayerState;
import defpackage.t8a;
import io.reactivex.g;

public final class c0 implements fjf<b0> {
    private final wlf<g<PlayerState>> a;
    private final wlf<t8a.a> b;

    public c0(wlf<g<PlayerState>> wlf, wlf<t8a.a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b0(this.a.get(), this.b.get());
    }
}
