package com.spotify.music.features.connect.discovery;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.spotify.android.flags.c;
import com.spotify.libs.connect.j;
import com.spotify.libs.connect.t;
import com.spotify.music.features.connect.cast.discovery.b;
import com.spotify.music.features.connect.cast.discovery.e;
import com.spotify.music.libs.mediasession.m0;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;

public final class h implements fjf<g> {
    private final wlf<Context> a;
    private final wlf<t> b;
    private final wlf<m0> c;
    private final wlf<ImmutableSet<com.spotify.music.features.connect.cast.discovery.h>> d;
    private final wlf<e> e;
    private final wlf<g<c>> f;
    private final wlf<an4> g;
    private final wlf<b> h;
    private final wlf<or0> i;
    private final wlf<y> j;
    private final wlf<s<com.spotify.music.connection.g>> k;
    private final wlf<j> l;
    private final wlf<yl4> m;

    public h(wlf<Context> wlf, wlf<t> wlf2, wlf<m0> wlf3, wlf<ImmutableSet<com.spotify.music.features.connect.cast.discovery.h>> wlf4, wlf<e> wlf5, wlf<g<c>> wlf6, wlf<an4> wlf7, wlf<b> wlf8, wlf<or0> wlf9, wlf<y> wlf10, wlf<s<com.spotify.music.connection.g>> wlf11, wlf<j> wlf12, wlf<yl4> wlf13) {
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

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get());
    }
}
