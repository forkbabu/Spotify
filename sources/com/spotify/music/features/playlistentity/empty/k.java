package com.spotify.music.features.playlistentity.empty;

import com.spotify.music.navigation.t;
import io.reactivex.y;

public final class k implements fjf<j> {
    private final wlf<f> a;
    private final wlf<wec> b;
    private final wlf<t> c;
    private final wlf<String> d;
    private final wlf<y> e;

    public k(wlf<f> wlf, wlf<wec> wlf2, wlf<t> wlf3, wlf<String> wlf4, wlf<y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a, this.b, this.c, this.d, this.e);
    }
}
