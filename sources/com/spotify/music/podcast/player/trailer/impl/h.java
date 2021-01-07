package com.spotify.music.podcast.player.trailer.impl;

import com.spotify.player.controls.d;
import com.spotify.player.play.f;
import io.reactivex.g;

public final class h implements fjf<PlayerApiTrailerPlayerActionPerformer> {
    private final wlf<f> a;
    private final wlf<lxd> b;
    private final wlf<g<Boolean>> c;
    private final wlf<d> d;
    private final wlf<unc> e;

    public h(wlf<f> wlf, wlf<lxd> wlf2, wlf<g<Boolean>> wlf3, wlf<d> wlf4, wlf<unc> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PlayerApiTrailerPlayerActionPerformer(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
