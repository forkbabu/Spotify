package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.m;
import io.reactivex.s;

public final class m3 implements fjf<l3> {
    private final wlf<e1> a;
    private final wlf<s9a> b;
    private final wlf<m> c;
    private final wlf<s<Boolean>> d;

    public m3(wlf<e1> wlf, wlf<s9a> wlf2, wlf<m> wlf3, wlf<s<Boolean>> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l3(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
