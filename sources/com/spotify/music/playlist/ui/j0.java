package com.spotify.music.playlist.ui;

import android.content.Context;

public final class j0 implements fjf<i0> {
    private final wlf<Context> a;

    public j0(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i0(this.a.get());
    }
}
