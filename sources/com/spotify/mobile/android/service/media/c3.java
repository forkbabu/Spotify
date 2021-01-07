package com.spotify.mobile.android.service.media;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class c3 implements fjf<b3> {
    private final wlf<pea> a;
    private final wlf<g<PlayerState>> b;

    public c3(wlf<pea> wlf, wlf<g<PlayerState>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b3(this.a, this.b);
    }
}
