package com.spotify.music.nowplaying.podcastads.cta;

import com.spotify.music.navigation.t;
import com.spotify.player.model.ContextTrack;
import io.reactivex.g;

public final class d implements fjf<c> {
    private final wlf<g<ContextTrack>> a;
    private final wlf<t> b;

    public d(wlf<g<ContextTrack>> wlf, wlf<t> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get());
    }
}
