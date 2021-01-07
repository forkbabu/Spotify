package com.spotify.music.features.browse.view;

import android.content.Context;
import com.spotify.ubi.specification.factories.b0;

public final class b implements fjf<a> {
    private final wlf<Context> a;
    private final wlf<b0> b;

    public b(wlf<Context> wlf, wlf<b0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.b.get());
    }
}
