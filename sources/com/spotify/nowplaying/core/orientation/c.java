package com.spotify.nowplaying.core.orientation;

import io.reactivex.g;

public final class c implements fjf<b> {
    private final wlf<g<OrientationMode>> a;
    private final wlf<androidx.fragment.app.c> b;

    public c(wlf<g<OrientationMode>> wlf, wlf<androidx.fragment.app.c> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.b.get());
    }
}
