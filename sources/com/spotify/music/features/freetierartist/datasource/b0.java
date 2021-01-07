package com.spotify.music.features.freetierartist.datasource;

import com.spotify.music.connection.l;
import com.spotify.music.libs.freetiertrackpreview.transformer.a;
import com.spotify.music.libs.freetiertrackpreview.transformer.e;

public final class b0 implements fjf<a0> {
    private final wlf<wf3> a;
    private final wlf<c0> b;
    private final wlf<b85> c;
    private final wlf<t> d;
    private final wlf<l> e;
    private final wlf<q> f;
    private final wlf<y> g;
    private final wlf<String> h;
    private final wlf<Boolean> i;
    private final wlf<ve3> j;
    private final wlf<z75> k;
    private final wlf<d85> l;
    private final wlf<kk9> m;
    private final wlf<zec> n;
    private final wlf<pe3> o;
    private final wlf<ld3> p;
    private final wlf<a> q;
    private final wlf<e> r;

    public b0(wlf<wf3> wlf, wlf<c0> wlf2, wlf<b85> wlf3, wlf<t> wlf4, wlf<l> wlf5, wlf<q> wlf6, wlf<y> wlf7, wlf<String> wlf8, wlf<Boolean> wlf9, wlf<ve3> wlf10, wlf<z75> wlf11, wlf<d85> wlf12, wlf<kk9> wlf13, wlf<zec> wlf14, wlf<pe3> wlf15, wlf<ld3> wlf16, wlf<a> wlf17, wlf<e> wlf18) {
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
        return new a0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get().booleanValue(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get(), this.o.get(), this.p.get(), this.q.get(), this.r.get());
    }
}
