package com.spotify.music.features.followfeed.mobius;

import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.features.followfeed.mobius.effecthandlers.a;
import com.spotify.music.features.followfeed.mobius.effecthandlers.b0;
import com.spotify.music.features.followfeed.mobius.effecthandlers.c;
import com.spotify.music.features.followfeed.mobius.effecthandlers.e0;
import com.spotify.music.features.followfeed.mobius.effecthandlers.g;
import com.spotify.music.features.followfeed.mobius.effecthandlers.k;
import com.spotify.music.features.followfeed.mobius.effecthandlers.n;
import com.spotify.music.features.followfeed.mobius.effecthandlers.p;
import com.spotify.music.features.followfeed.mobius.effecthandlers.r;
import com.spotify.music.features.followfeed.mobius.effecthandlers.t;
import com.spotify.music.features.followfeed.mobius.effecthandlers.v;
import io.reactivex.y;

public final class h implements fjf<d> {
    private final wlf<y> a;
    private final wlf<y> b;
    private final wlf<y> c;
    private final wlf<g> d;
    private final wlf<r> e;
    private final wlf<k> f;
    private final wlf<b0> g;
    private final wlf<e0> h;
    private final wlf<n> i;
    private final wlf<p> j;
    private final wlf<v> k;
    private final wlf<com.spotify.music.features.followfeed.mobius.effecthandlers.y> l;
    private final wlf<c> m;
    private final wlf<a> n;
    private final wlf<t> o;
    private final wlf<x35> p;
    private final wlf<ExplicitContentFacade> q;
    private final wlf<Boolean> r;

    public h(wlf<y> wlf, wlf<y> wlf2, wlf<y> wlf3, wlf<g> wlf4, wlf<r> wlf5, wlf<k> wlf6, wlf<b0> wlf7, wlf<e0> wlf8, wlf<n> wlf9, wlf<p> wlf10, wlf<v> wlf11, wlf<com.spotify.music.features.followfeed.mobius.effecthandlers.y> wlf12, wlf<c> wlf13, wlf<a> wlf14, wlf<t> wlf15, wlf<x35> wlf16, wlf<ExplicitContentFacade> wlf17, wlf<Boolean> wlf18) {
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
        this.n = wlf14;
        this.o = wlf15;
        this.p = wlf16;
        this.q = wlf17;
        this.r = wlf18;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get(), this.o.get(), this.p.get(), this.q.get(), this.r.get().booleanValue());
    }
}
