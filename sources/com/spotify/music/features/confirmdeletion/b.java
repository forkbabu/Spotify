package com.spotify.music.features.confirmdeletion;

import android.content.Context;

public final class b implements fjf<a> {
    private final wlf<Context> a;
    private final wlf<com.spotify.music.navigation.b> b;

    public b(wlf<Context> wlf, wlf<com.spotify.music.navigation.b> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.b.get());
    }
}
