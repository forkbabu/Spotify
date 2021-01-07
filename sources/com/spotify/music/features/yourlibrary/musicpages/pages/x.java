package com.spotify.music.features.yourlibrary.musicpages.pages;

import android.content.Context;
import com.spotify.music.features.yourlibrary.musicpages.filterandsort.b1;

public final class x implements fjf<w> {
    private final wlf<Context> a;
    private final wlf<b1> b;

    public x(wlf<Context> wlf, wlf<b1> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w(this.a.get(), this.b.get());
    }
}
