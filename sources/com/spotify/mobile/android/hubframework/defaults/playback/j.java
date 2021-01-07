package com.spotify.mobile.android.hubframework.defaults.playback;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public final class j implements fjf<i> {
    private final wlf<g<PlayerState>> a;
    private final wlf<y> b;

    public j(wlf<g<PlayerState>> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get(), this.b.get());
    }
}
