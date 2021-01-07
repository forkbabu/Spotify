package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.music.features.yourlibrary.musicpages.filterandsort.i1;
import com.spotify.music.features.yourlibrary.musicpages.item.m;

public final class p4 implements fjf<o4> {
    private final wlf<m> a;
    private final wlf<i1> b;

    public p4(wlf<m> wlf, wlf<i1> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o4(this.a.get(), this.b.get());
    }
}
