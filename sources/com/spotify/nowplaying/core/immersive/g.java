package com.spotify.nowplaying.core.immersive;

import android.view.Window;

public final class g implements fjf<f> {
    private final wlf<Window> a;

    public g(wlf<Window> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get());
    }
}
