package com.spotify.music.podcast.freetierlikes.tabs;

import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.c;

public final class j implements fjf<i> {
    private final wlf<cqe> a;
    private final wlf<jz1> b;
    private final wlf<a> c;
    private final wlf<c> d;
    private final wlf<ere> e;

    public j(wlf<cqe> wlf, wlf<jz1> wlf2, wlf<a> wlf3, wlf<c> wlf4, wlf<ere> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static j a(wlf<cqe> wlf, wlf<jz1> wlf2, wlf<a> wlf3, wlf<c> wlf4, wlf<ere> wlf5) {
        return new j(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
