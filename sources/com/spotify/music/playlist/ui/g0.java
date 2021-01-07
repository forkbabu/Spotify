package com.spotify.music.playlist.ui;

import android.content.Context;

public final class g0 implements fjf<f0> {
    private final wlf<Context> a;

    public g0(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f0(this.a.get());
    }
}
