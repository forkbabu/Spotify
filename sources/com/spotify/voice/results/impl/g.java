package com.spotify.voice.results.impl;

import com.spotify.player.play.f;
import io.reactivex.y;

public final class g implements fjf<f> {
    private final wlf<io.reactivex.g<ugf>> a;
    private final wlf<qg0<String>> b;
    private final wlf<com.spotify.voice.results.model.g> c;
    private final wlf<f> d;
    private final wlf<y> e;
    private final wlf<y> f;

    public g(wlf<io.reactivex.g<ugf>> wlf, wlf<qg0<String>> wlf2, wlf<com.spotify.voice.results.model.g> wlf3, wlf<f> wlf4, wlf<y> wlf5, wlf<y> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
