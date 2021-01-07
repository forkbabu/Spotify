package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.m;

public final class r3 implements fjf<q3> {
    private final wlf<e1> a;
    private final wlf<z9a> b;
    private final wlf<m> c;

    public r3(wlf<e1> wlf, wlf<z9a> wlf2, wlf<m> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q3(this.a, this.b, this.c);
    }
}
