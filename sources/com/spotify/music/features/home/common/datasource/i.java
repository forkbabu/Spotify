package com.spotify.music.features.home.common.datasource;

import com.spotify.android.flags.c;
import com.spotify.remoteconfig.AndroidFeatureHomeProperties;

public final class i implements fjf<h> {
    private final wlf<g> a;
    private final wlf<c> b;
    private final wlf<cqe> c;
    private final wlf<Boolean> d;
    private final wlf<String> e;
    private final wlf<String> f;
    private final wlf<String> g;
    private final wlf<Boolean> h;
    private final wlf<Boolean> i;
    private final wlf<AndroidFeatureHomeProperties> j;
    private final wlf<hha> k;

    public i(wlf<g> wlf, wlf<c> wlf2, wlf<cqe> wlf3, wlf<Boolean> wlf4, wlf<String> wlf5, wlf<String> wlf6, wlf<String> wlf7, wlf<Boolean> wlf8, wlf<Boolean> wlf9, wlf<AndroidFeatureHomeProperties> wlf10, wlf<hha> wlf11) {
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

    public static i a(wlf<g> wlf, wlf<c> wlf2, wlf<cqe> wlf3, wlf<Boolean> wlf4, wlf<String> wlf5, wlf<String> wlf6, wlf<String> wlf7, wlf<Boolean> wlf8, wlf<Boolean> wlf9, wlf<AndroidFeatureHomeProperties> wlf10, wlf<hha> wlf11) {
        return new i(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10, wlf11);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get(), this.c.get(), this.d.get().booleanValue(), this.e.get(), this.f.get(), this.g.get(), this.h.get().booleanValue(), this.i.get().booleanValue(), this.j.get(), this.k.get());
    }
}
