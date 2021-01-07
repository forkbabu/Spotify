package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.m;

public final class n5 implements fjf<m5> {
    private final wlf<k5> a;
    private final wlf<e1> b;
    private final wlf<m> c;

    public n5(wlf<k5> wlf, wlf<e1> wlf2, wlf<m> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m5(this.a.get(), this.b.get(), this.c.get());
    }
}
