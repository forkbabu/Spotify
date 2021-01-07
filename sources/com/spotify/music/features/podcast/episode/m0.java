package com.spotify.music.features.podcast.episode;

import com.spotify.mobile.android.quotesharing.i;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.navigation.t;
import com.spotify.music.podcastentityrow.d;
import io.reactivex.y;

public final class m0 implements fjf<l0> {
    private final wlf<o0> a;
    private final wlf<j0> b;
    private final wlf<t> c;
    private final wlf<cjc> d;
    private final wlf<jzc> e;
    private final wlf<e0> f;
    private final wlf<oa7> g;
    private final wlf<String> h;
    private final wlf<y> i;
    private final wlf<y> j;
    private final wlf<ExplicitContentFacade> k;
    private final wlf<d> l;
    private final wlf<i> m;
    private final wlf<txc> n;
    private final wlf<tb7> o;

    public m0(wlf<o0> wlf, wlf<j0> wlf2, wlf<t> wlf3, wlf<cjc> wlf4, wlf<jzc> wlf5, wlf<e0> wlf6, wlf<oa7> wlf7, wlf<String> wlf8, wlf<y> wlf9, wlf<y> wlf10, wlf<ExplicitContentFacade> wlf11, wlf<d> wlf12, wlf<i> wlf13, wlf<txc> wlf14, wlf<tb7> wlf15) {
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
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get(), this.o.get());
    }
}
