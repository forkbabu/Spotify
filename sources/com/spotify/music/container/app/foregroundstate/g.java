package com.spotify.music.container.app.foregroundstate;

import android.content.Context;

public final class g implements fjf<f> {
    private final wlf<Context> a;

    public g(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get());
    }
}
