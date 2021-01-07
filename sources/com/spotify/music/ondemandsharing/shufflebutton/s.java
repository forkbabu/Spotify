package com.spotify.music.ondemandsharing.shufflebutton;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public final class s implements fjf<r> {
    private final wlf<g<PlayerState>> a;
    private final wlf<y> b;

    public s(wlf<g<PlayerState>> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r(this.a.get(), this.b.get());
    }
}
