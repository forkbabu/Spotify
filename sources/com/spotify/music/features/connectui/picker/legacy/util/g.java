package com.spotify.music.features.connectui.picker.legacy.util;

import android.content.Context;

public final class g implements fjf<f> {
    private final wlf<Context> a;
    private final wlf<b> b;

    public g(wlf<Context> wlf, wlf<b> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get(), this.b.get());
    }
}
