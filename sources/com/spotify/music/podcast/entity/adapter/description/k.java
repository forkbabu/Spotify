package com.spotify.music.podcast.entity.adapter.description;

import com.spotify.music.podcast.entity.adapter.description.h;
import defpackage.kqc;

public final class k implements fjf<j> {
    private final wlf<h.a> a;
    private final wlf<kqc.a> b;
    private final wlf<eoa> c;
    private final wlf<eoa> d;

    public k(wlf<h.a> wlf, wlf<kqc.a> wlf2, wlf<eoa> wlf3, wlf<eoa> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(ejf.a(this.a), this.b.get(), this.c.get(), this.d.get());
    }
}
