package com.spotify.music.features.premiumdestination;

import android.content.Context;
import com.spotify.http.u;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import io.reactivex.s;
import io.reactivex.y;

public final class k implements fjf<j> {
    private final wlf<Context> a;
    private final wlf<s<Offer>> b;
    private final wlf<ji7> c;
    private final wlf<y> d;
    private final wlf<s<Offer>> e;
    private final wlf<String> f;
    private final wlf<String> g;
    private final wlf<String> h;
    private final wlf<String> i;
    private final wlf<String> j;
    private final wlf<String> k;
    private final wlf<mi7> l;
    private final wlf<u> m;
    private final wlf<String> n;
    private final wlf<Boolean> o;
    private final wlf<String> p;
    private final wlf<String> q;
    private final wlf<String> r;
    private final wlf<String> s;
    private final wlf<String> t;
    private final wlf<String> u;
    private final wlf<String> v;

    public k(wlf<Context> wlf, wlf<s<Offer>> wlf2, wlf<ji7> wlf3, wlf<y> wlf4, wlf<s<Offer>> wlf5, wlf<String> wlf6, wlf<String> wlf7, wlf<String> wlf8, wlf<String> wlf9, wlf<String> wlf10, wlf<String> wlf11, wlf<mi7> wlf12, wlf<u> wlf13, wlf<String> wlf14, wlf<Boolean> wlf15, wlf<String> wlf16, wlf<String> wlf17, wlf<String> wlf18, wlf<String> wlf19, wlf<String> wlf20, wlf<String> wlf21, wlf<String> wlf22) {
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

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get(), this.o.get().booleanValue(), this.p.get(), this.q.get(), this.r.get(), this.s.get(), this.t.get(), this.u.get(), this.v.get());
    }
}
