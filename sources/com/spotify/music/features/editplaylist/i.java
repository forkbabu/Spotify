package com.spotify.music.features.editplaylist;

import android.content.Context;
import com.spotify.music.navigation.b;

public final class i implements fjf<h> {
    private final wlf<Context> a;
    private final wlf<b> b;

    public i(wlf<Context> wlf, wlf<b> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get());
    }
}
