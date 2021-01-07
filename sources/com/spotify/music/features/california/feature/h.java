package com.spotify.music.features.california.feature;

import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class h implements fjf<g> {
    private final wlf<f> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<ere> c;
    private final wlf<d> d;

    public h(wlf<f> wlf, wlf<g<PlayerState>> wlf2, wlf<ere> wlf3, wlf<d> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a, this.b, this.c, this.d);
    }
}
