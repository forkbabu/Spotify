package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.i;

public final class h1 implements fjf<g1> {
    private final wlf<Context> a;
    private final wlf<i> b;

    public h1(wlf<Context> wlf, wlf<i> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g1(this.a.get(), this.b.get());
    }
}
