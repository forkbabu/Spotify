package com.spotify.music.nowplaying.common.view.trackinfo;

import com.spotify.music.navigation.t;
import com.spotify.player.model.ContextTrack;
import io.reactivex.g;

public final class d implements fjf<c> {
    private final wlf<g<ContextTrack>> a;
    private final wlf<t> b;
    private final wlf<frd> c;

    public d(wlf<g<ContextTrack>> wlf, wlf<t> wlf2, wlf<frd> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get());
    }
}
