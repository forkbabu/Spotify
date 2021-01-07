package com.spotify.music.features.connectui.picker.ui;

import com.spotify.music.features.connectui.picker.legacy.util.f;

public final class b implements fjf<a> {
    private final wlf<f> a;
    private final wlf<c> b;
    private final wlf<com.spotify.music.features.connectui.picker.legacy.util.b> c;
    private final wlf<com.spotify.music.features.connectui.picker.frictionlessjoin.ui.facepile.b> d;

    public b(wlf<f> wlf, wlf<c> wlf2, wlf<com.spotify.music.features.connectui.picker.legacy.util.b> wlf3, wlf<com.spotify.music.features.connectui.picker.frictionlessjoin.ui.facepile.b> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
