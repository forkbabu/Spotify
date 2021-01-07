package com.spotify.music.nowplaying.musicvideotoggle.widget.previousbutton;

import com.spotify.nowplaying.ui.components.controls.previous.d;
import com.spotify.player.model.Restrictions;
import io.reactivex.g;

public final class e implements fjf<d> {
    private final wlf<g<Restrictions>> a;
    private final wlf<g<String>> b;
    private final wlf<d> c;
    private final wlf<com.spotify.music.nowplaying.musicvideotoggle.widget.e> d;

    public e(wlf<g<Restrictions>> wlf, wlf<g<String>> wlf2, wlf<d> wlf3, wlf<com.spotify.music.nowplaying.musicvideotoggle.widget.e> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
