package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import com.spotify.music.podcast.freetierlikes.tabs.l;
import com.spotify.podcast.endpoints.collection.i;
import io.reactivex.y;

public final class t implements fjf<s> {
    private final wlf<i0> a;
    private final wlf<i> b;
    private final wlf<i.a> c;
    private final wlf<z> d;
    private final wlf<d0> e;
    private final wlf<txc> f;
    private final wlf<l> g;
    private final wlf<String> h;
    private final wlf<pnc> i;
    private final wlf<y> j;

    public t(wlf<i0> wlf, wlf<i> wlf2, wlf<i.a> wlf3, wlf<z> wlf4, wlf<d0> wlf5, wlf<txc> wlf6, wlf<l> wlf7, wlf<String> wlf8, wlf<pnc> wlf9, wlf<y> wlf10) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
