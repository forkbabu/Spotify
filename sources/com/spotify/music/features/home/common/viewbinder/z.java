package com.spotify.music.features.home.common.viewbinder;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.music.features.home.experimental.e;
import com.spotify.remoteconfig.AndroidFeatureHomeProperties;
import com.spotify.remoteconfig.j8;

public final class z implements fjf<y> {
    private final wlf<Context> a;
    private final wlf<e> b;
    private final wlf<m> c;
    private final wlf<cr9> d;
    private final wlf<j8> e;
    private final wlf<AndroidFeatureHomeProperties> f;
    private final wlf<e60> g;
    private final wlf<r> h;

    public z(wlf<Context> wlf, wlf<e> wlf2, wlf<m> wlf3, wlf<cr9> wlf4, wlf<j8> wlf5, wlf<AndroidFeatureHomeProperties> wlf6, wlf<e60> wlf7, wlf<r> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    public static z a(wlf<Context> wlf, wlf<e> wlf2, wlf<m> wlf3, wlf<cr9> wlf4, wlf<j8> wlf5, wlf<AndroidFeatureHomeProperties> wlf6, wlf<e60> wlf7, wlf<r> wlf8) {
        return new z(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new y(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
