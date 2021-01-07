package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.m;
import com.spotify.playlist.endpoints.p;
import com.spotify.playlist.formatlisttype.a;
import io.reactivex.s;

public final class b5 implements fjf<a5> {
    private final wlf<e1> a;
    private final wlf<p> b;
    private final wlf<m> c;
    private final wlf<s<Boolean>> d;
    private final wlf<a> e;

    public b5(wlf<e1> wlf, wlf<p> wlf2, wlf<m> wlf3, wlf<s<Boolean>> wlf4, wlf<a> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a5(this.a, this.b, this.c, this.d, this.e);
    }
}
