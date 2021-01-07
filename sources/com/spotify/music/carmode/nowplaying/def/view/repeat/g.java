package com.spotify.music.carmode.nowplaying.def.view.repeat;

import com.spotify.nowplaying.ui.components.repeat.d;

public final class g implements fjf<f> {
    private final wlf<d> a;

    public g(wlf<d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get());
    }
}
