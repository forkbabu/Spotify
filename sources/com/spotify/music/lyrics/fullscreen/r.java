package com.spotify.music.lyrics.fullscreen;

import com.spotify.player.model.PlayerState;
import com.spotify.player.stateful.q;
import io.reactivex.g;

public final class r implements fjf<g<PlayerState>> {
    private final wlf<q> a;

    public r(wlf<q> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().c().C(f.a);
    }
}
