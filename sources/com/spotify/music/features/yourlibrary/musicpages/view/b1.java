package com.spotify.music.features.yourlibrary.musicpages.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.libs.glue.custom.playbutton.c;
import com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger;
import com.spotify.music.features.yourlibrary.musicpages.datasource.x4;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.o;
import com.spotify.music.features.yourlibrary.musicpages.k1;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.features.yourlibrary.musicpages.pages.q;
import com.spotify.music.features.yourlibrary.musicpages.pages.s;
import com.spotify.music.features.yourlibrary.musicpages.pages.y;

public class b1 {
    private final wlf<xc9> a;
    private final wlf<y29> b;
    private final wlf<gi9> c;
    private final wlf<q> d;
    private final wlf<s> e;
    private final wlf<y> f;
    private final wlf<x4> g;
    private final wlf<q79> h;
    private final wlf<h0> i;
    private final wlf<r0> j;
    private final wlf<k1> k;
    private final wlf<d1> l;
    private final wlf<v0> m;
    private final wlf<e1> n;
    private final wlf<o> o;
    private final wlf<c.a> p;
    private final wlf<hg9> q;
    private final wlf<rg9> r;
    private final wlf<qg9> s;
    private final wlf<zc9> t;
    private final wlf<MusicPagesLogger> u;
    private final wlf<lg9> v;

    public b1(wlf<xc9> wlf, wlf<y29> wlf2, wlf<gi9> wlf3, wlf<q> wlf4, wlf<s> wlf5, wlf<y> wlf6, wlf<x4> wlf7, wlf<q79> wlf8, wlf<h0> wlf9, wlf<r0> wlf10, wlf<k1> wlf11, wlf<d1> wlf12, wlf<v0> wlf13, wlf<e1> wlf14, wlf<o> wlf15, wlf<c.a> wlf16, wlf<hg9> wlf17, wlf<rg9> wlf18, wlf<qg9> wlf19, wlf<zc9> wlf20, wlf<MusicPagesLogger> wlf21, wlf<lg9> wlf22) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
        a(wlf6, 6);
        this.f = wlf6;
        a(wlf7, 7);
        this.g = wlf7;
        a(wlf8, 8);
        this.h = wlf8;
        a(wlf9, 9);
        this.i = wlf9;
        a(wlf10, 10);
        this.j = wlf10;
        a(wlf11, 11);
        this.k = wlf11;
        a(wlf12, 12);
        this.l = wlf12;
        a(wlf13, 13);
        this.m = wlf13;
        a(wlf14, 14);
        this.n = wlf14;
        a(wlf15, 15);
        this.o = wlf15;
        a(wlf16, 16);
        this.p = wlf16;
        a(wlf17, 17);
        this.q = wlf17;
        a(wlf18, 18);
        this.r = wlf18;
        a(wlf19, 19);
        this.s = wlf19;
        a(wlf20, 20);
        this.t = wlf20;
        a(wlf21, 21);
        this.u = wlf21;
        a(wlf22, 22);
        this.v = wlf22;
    }

    private static <T> T a(T t2, int i2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    public a1 b(LayoutInflater layoutInflater, ViewGroup viewGroup, MusicPageId musicPageId, Bundle bundle, MusicPagesViewLoadingTrackerConnectable musicPagesViewLoadingTrackerConnectable) {
        xc9 xc9 = this.a.get();
        a(xc9, 1);
        y29 y29 = this.b.get();
        a(y29, 2);
        gi9 gi9 = this.c.get();
        a(gi9, 3);
        q qVar = this.d.get();
        a(qVar, 4);
        s sVar = this.e.get();
        a(sVar, 5);
        y yVar = this.f.get();
        a(yVar, 6);
        x4 x4Var = this.g.get();
        a(x4Var, 7);
        q79 q79 = this.h.get();
        a(q79, 8);
        h0 h0Var = this.i.get();
        a(h0Var, 9);
        r0 r0Var = this.j.get();
        a(r0Var, 10);
        k1 k1Var = this.k.get();
        a(k1Var, 11);
        d1 d1Var = this.l.get();
        a(d1Var, 12);
        d1 d1Var2 = d1Var;
        v0 v0Var = this.m.get();
        a(v0Var, 13);
        v0 v0Var2 = v0Var;
        e1 e1Var = this.n.get();
        a(e1Var, 14);
        e1 e1Var2 = e1Var;
        o oVar = this.o.get();
        a(oVar, 15);
        o oVar2 = oVar;
        c.a aVar = this.p.get();
        a(aVar, 16);
        c.a aVar2 = aVar;
        hg9 hg9 = this.q.get();
        a(hg9, 17);
        hg9 hg92 = hg9;
        rg9 rg9 = this.r.get();
        a(rg9, 18);
        rg9 rg92 = rg9;
        qg9 qg9 = this.s.get();
        a(qg9, 19);
        qg9 qg92 = qg9;
        zc9 zc9 = this.t.get();
        a(zc9, 20);
        zc9 zc92 = zc9;
        MusicPagesLogger musicPagesLogger = this.u.get();
        a(musicPagesLogger, 21);
        MusicPagesLogger musicPagesLogger2 = musicPagesLogger;
        lg9 lg9 = this.v.get();
        a(lg9, 22);
        a(layoutInflater, 23);
        a(musicPageId, 25);
        a(musicPagesViewLoadingTrackerConnectable, 27);
        return new a1(xc9, y29, gi9, qVar, sVar, yVar, x4Var, q79, h0Var, r0Var, k1Var, d1Var2, v0Var2, e1Var2, oVar2, aVar2, hg92, rg92, qg92, zc92, musicPagesLogger2, lg9, layoutInflater, viewGroup, musicPageId, bundle, musicPagesViewLoadingTrackerConnectable);
    }
}
