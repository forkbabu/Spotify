package com.spotify.music.features.yourlibrary.musicpages.filtertags.loader;

import com.spotify.music.features.yourlibrary.musicpages.e1;

public final class d implements fjf<c> {
    private final wlf<e1> a;
    private final wlf<a> b;
    private final wlf<cqe> c;

    public d(wlf<e1> wlf, wlf<a> wlf2, wlf<cqe> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get());
    }
}
