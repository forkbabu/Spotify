package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import android.content.res.Resources;
import com.spotify.music.features.yourlibrary.musicpages.e1;

public final class c1 implements fjf<b1> {
    private final wlf<e1> a;
    private final wlf<Resources> b;

    public c1(wlf<e1> wlf, wlf<Resources> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b1(this.a.get(), this.b.get());
    }
}
