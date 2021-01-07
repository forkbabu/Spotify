package com.spotify.music.nowplaying.musicvideotoggle.widget.togglebutton;

import com.spotify.music.nowplaying.musicvideotoggle.widget.e;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class f implements fjf<e> {
    private final wlf<e> a;
    private final wlf<nzb> b;
    private final wlf<g<PlayerState>> c;
    private final wlf<com.spotify.music.nowplaying.musicvideotoggle.widget.g> d;

    public f(wlf<e> wlf, wlf<nzb> wlf2, wlf<g<PlayerState>> wlf3, wlf<com.spotify.music.nowplaying.musicvideotoggle.widget.g> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
