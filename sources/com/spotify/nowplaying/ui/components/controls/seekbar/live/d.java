package com.spotify.nowplaying.ui.components.controls.seekbar.live;

import com.spotify.player.model.ContextTrack;
import io.reactivex.g;

public final class d implements fjf<c> {
    private final wlf<g<ContextTrack>> a;

    public d(wlf<g<ContextTrack>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get());
    }
}
