package com.spotify.music.features.home.common.viewbinder;

import android.content.Context;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderV2Behavior;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.music.features.home.experimental.e;
import com.spotify.remoteconfig.AndroidFeatureHomeProperties;
import com.spotify.remoteconfig.j8;

public final class x implements fjf<w> {
    private final wlf<Context> a;
    private final wlf<p> b;
    private final wlf<u> c;
    private final wlf<e> d;
    private final wlf<r> e;
    private final wlf<m> f;
    private final wlf<cr9> g;
    private final wlf<n> h;
    private final wlf<FadingHomeHeaderViewBehavior> i;
    private final wlf<GlueHeaderV2Behavior> j;
    private final wlf<e60> k;
    private final wlf<j8> l;
    private final wlf<AndroidFeatureHomeProperties> m;

    public x(wlf<Context> wlf, wlf<p> wlf2, wlf<u> wlf3, wlf<e> wlf4, wlf<r> wlf5, wlf<m> wlf6, wlf<cr9> wlf7, wlf<n> wlf8, wlf<FadingHomeHeaderViewBehavior> wlf9, wlf<GlueHeaderV2Behavior> wlf10, wlf<e60> wlf11, wlf<j8> wlf12, wlf<AndroidFeatureHomeProperties> wlf13) {
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
        this.l = wlf12;
        this.m = wlf13;
    }

    public static x a(wlf<Context> wlf, wlf<p> wlf2, wlf<u> wlf3, wlf<e> wlf4, wlf<r> wlf5, wlf<m> wlf6, wlf<cr9> wlf7, wlf<n> wlf8, wlf<FadingHomeHeaderViewBehavior> wlf9, wlf<GlueHeaderV2Behavior> wlf10, wlf<e60> wlf11, wlf<j8> wlf12, wlf<AndroidFeatureHomeProperties> wlf13) {
        return new x(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10, wlf11, wlf12, wlf13);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w(this.a.get(), this.b.get(), this.c, this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get());
    }
}
