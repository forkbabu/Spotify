package com.spotify.mobile.android.service.media;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.follow.m;
import com.spotify.music.follow.resolver.f;
import com.spotify.music.libs.viewuri.c;
import com.spotify.playlist.endpoints.p;
import com.spotify.playlist.endpoints.v;

public final class d2 implements fjf<c2> {
    private final wlf<t8a> a;
    private final wlf<CollectionStateProvider> b;
    private final wlf<c> c;
    private final wlf<p> d;
    private final wlf<v> e;
    private final wlf<m> f;
    private final wlf<f> g;
    private final wlf<ih0> h;

    public d2(wlf<t8a> wlf, wlf<CollectionStateProvider> wlf2, wlf<c> wlf3, wlf<p> wlf4, wlf<v> wlf5, wlf<m> wlf6, wlf<f> wlf7, wlf<ih0> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c2(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
