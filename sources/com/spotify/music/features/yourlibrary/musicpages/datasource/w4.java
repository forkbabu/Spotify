package com.spotify.music.features.yourlibrary.musicpages.datasource;

import android.content.Context;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.m;
import io.reactivex.g;
import io.reactivex.s;

public final class w4 implements fjf<v4> {
    private final wlf<Context> a;
    private final wlf<e1> b;
    private final wlf<t4> c;
    private final wlf<d5> d;
    private final wlf<a5> e;
    private final wlf<h5> f;
    private final wlf<jf9> g;
    private final wlf<yd9> h;
    private final wlf<q3> i;
    private final wlf<j3> j;
    private final wlf<n3> k;
    private final wlf<l3> l;
    private final wlf<o4> m;
    private final wlf<m5> n;
    private final wlf<hb9> o;
    private final wlf<m> p;
    private final wlf<h69> q;
    private final wlf<g<SessionState>> r;
    private final wlf<s<Boolean>> s;
    private final wlf<s<Boolean>> t;
    private final wlf<s<Boolean>> u;
    private final wlf<String> v;

    public w4(wlf<Context> wlf, wlf<e1> wlf2, wlf<t4> wlf3, wlf<d5> wlf4, wlf<a5> wlf5, wlf<h5> wlf6, wlf<jf9> wlf7, wlf<yd9> wlf8, wlf<q3> wlf9, wlf<j3> wlf10, wlf<n3> wlf11, wlf<l3> wlf12, wlf<o4> wlf13, wlf<m5> wlf14, wlf<hb9> wlf15, wlf<m> wlf16, wlf<h69> wlf17, wlf<g<SessionState>> wlf18, wlf<s<Boolean>> wlf19, wlf<s<Boolean>> wlf20, wlf<s<Boolean>> wlf21, wlf<String> wlf22) {
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
        this.s = wlf19;
        this.t = wlf20;
        this.u = wlf21;
        this.v = wlf22;
    }

    public static w4 a(wlf<Context> wlf, wlf<e1> wlf2, wlf<t4> wlf3, wlf<d5> wlf4, wlf<a5> wlf5, wlf<h5> wlf6, wlf<jf9> wlf7, wlf<yd9> wlf8, wlf<q3> wlf9, wlf<j3> wlf10, wlf<n3> wlf11, wlf<l3> wlf12, wlf<o4> wlf13, wlf<m5> wlf14, wlf<hb9> wlf15, wlf<m> wlf16, wlf<h69> wlf17, wlf<g<SessionState>> wlf18, wlf<s<Boolean>> wlf19, wlf<s<Boolean>> wlf20, wlf<s<Boolean>> wlf21, wlf<String> wlf22) {
        return new w4(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10, wlf11, wlf12, wlf13, wlf14, wlf15, wlf16, wlf17, wlf18, wlf19, wlf20, wlf21, wlf22);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v4(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f, this.g, this.h.get(), this.i.get(), this.j, this.k, this.l, this.m, this.n.get(), this.o.get(), this.p.get(), this.q.get(), this.r.get(), this.s.get(), this.t.get(), this.u.get(), this.v.get());
    }
}
