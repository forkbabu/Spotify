package com.spotify.mobile.android.service.media;

import com.spotify.mobile.android.service.media.error.c;
import com.spotify.mobile.android.service.media.search.e;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public final class g2 implements fjf<f2> {
    private final wlf<y> a;
    private final wlf<g<SessionState>> b;
    private final wlf<g<PlayerState>> c;
    private final wlf<jz1> d;
    private final wlf<hv3> e;
    private final wlf<w1> f;
    private final wlf<ik1> g;
    private final wlf<b2> h;
    private final wlf<k2> i;
    private final wlf<q2> j;
    private final wlf<e> k;
    private final wlf<p2> l;
    private final wlf<c> m;
    private final wlf<w2> n;
    private final wlf<cl1> o;
    private final wlf<mk1> p;
    private final wlf<o4a> q;

    public g2(wlf<y> wlf, wlf<g<SessionState>> wlf2, wlf<g<PlayerState>> wlf3, wlf<jz1> wlf4, wlf<hv3> wlf5, wlf<w1> wlf6, wlf<ik1> wlf7, wlf<b2> wlf8, wlf<k2> wlf9, wlf<q2> wlf10, wlf<e> wlf11, wlf<p2> wlf12, wlf<c> wlf13, wlf<w2> wlf14, wlf<cl1> wlf15, wlf<mk1> wlf16, wlf<o4a> wlf17) {
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
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f2(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get(), this.o.get(), this.p.get(), this.q.get());
    }
}
