package com.spotify.music.podcast.freetierlikes.tabs.followed;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class e0 implements fjf<d0> {
    private final wlf<g<PlayerState>> a;

    public e0(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d0(this.a.get());
    }
}
