package com.spotify.music.features.connect.plugins;

import com.spotify.libs.connect.ConnectManager;
import com.spotify.music.features.connect.discovery.g;
import com.spotify.music.features.connect.discovery.j;
import io.reactivex.y;

public final class f implements fjf<e> {
    private final wlf<gs0> a;
    private final wlf<ConnectManager> b;
    private final wlf<cs0> c;
    private final wlf<g> d;
    private final wlf<y> e;
    private final wlf<hba> f;
    private final wlf<xca> g;
    private final wlf<j> h;
    private final wlf<c> i;
    private final wlf<qda> j;
    private final wlf<ru0> k;

    public f(wlf<gs0> wlf, wlf<ConnectManager> wlf2, wlf<cs0> wlf3, wlf<g> wlf4, wlf<y> wlf5, wlf<hba> wlf6, wlf<xca> wlf7, wlf<j> wlf8, wlf<c> wlf9, wlf<qda> wlf10, wlf<ru0> wlf11) {
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
        this.k = wlf11;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get());
    }
}
