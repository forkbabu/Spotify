package com.spotify.music.nowplaying.musicvideotoggle.widget.nextbutton;

import com.spotify.nowplaying.ui.components.controls.next.e;
import com.spotify.nowplaying.ui.components.controls.next.h;
import com.spotify.nowplaying.ui.components.controls.next.j;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class d implements fjf<c> {
    private final wlf<g<PlayerState>> a;
    private final wlf<j> b;
    private final wlf<h> c;
    private final wlf<e> d;
    private final wlf<com.spotify.music.nowplaying.musicvideotoggle.widget.e> e;

    public d(wlf<g<PlayerState>> wlf, wlf<j> wlf2, wlf<h> wlf3, wlf<e> wlf4, wlf<com.spotify.music.nowplaying.musicvideotoggle.widget.e> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
