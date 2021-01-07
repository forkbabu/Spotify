package com.spotify.music.libs.search.trending;

import com.spotify.music.libs.viewuri.c;

public final class d implements fjf<TrendingSearchLogger> {
    private final wlf<jz1> a;
    private final wlf<ifd> b;
    private final wlf<c> c;
    private final wlf<cqe> d;
    private final wlf<l81> e;
    private final wlf<b> f;

    public d(wlf<jz1> wlf, wlf<ifd> wlf2, wlf<c> wlf3, wlf<cqe> wlf4, wlf<l81> wlf5, wlf<b> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new TrendingSearchLogger(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
