package com.spotify.music.nowplaying.musicvideotoggle.widget;

import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class f implements fjf<MusicVideoToggleHandlerImpl> {
    private final wlf<szb> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<com.spotify.player.play.f> c;
    private final wlf<d> d;
    private final wlf<cqe> e;

    public f(wlf<szb> wlf, wlf<g<PlayerState>> wlf2, wlf<com.spotify.player.play.f> wlf3, wlf<d> wlf4, wlf<cqe> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new MusicVideoToggleHandlerImpl(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
