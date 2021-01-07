package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.m;
import com.spotify.playlist.endpoints.d;
import io.reactivex.s;

public final class u4 implements fjf<t4> {
    private final wlf<e1> a;
    private final wlf<d> b;
    private final wlf<m> c;
    private final wlf<s<Boolean>> d;
    private final wlf<String> e;

    public u4(wlf<e1> wlf, wlf<d> wlf2, wlf<m> wlf3, wlf<s<Boolean>> wlf4, wlf<String> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t4(this.a, this.b, this.c, this.d, this.e);
    }
}
