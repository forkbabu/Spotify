package com.spotify.music.newplaying.scroll.widgets.example;

import com.spotify.player.model.ContextTrack;

public final class g implements fjf<f> {
    private final wlf<io.reactivex.g<ContextTrack>> a;

    public g(wlf<io.reactivex.g<ContextTrack>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get());
    }
}
