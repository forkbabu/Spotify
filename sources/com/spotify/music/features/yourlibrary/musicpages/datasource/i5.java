package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.m;
import io.reactivex.s;

public final class i5 implements fjf<h5> {
    private final wlf<e1> a;
    private final wlf<faa> b;
    private final wlf<m> c;
    private final wlf<s<Boolean>> d;
    private final wlf<String> e;

    public i5(wlf<e1> wlf, wlf<faa> wlf2, wlf<m> wlf3, wlf<s<Boolean>> wlf4, wlf<String> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h5(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
