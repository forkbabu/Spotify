package com.spotify.music.features.yourlibrary.musicpages.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.music.features.yourlibrary.musicpages.datasource.x4;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.o;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.features.yourlibrary.musicpages.pages.q;
import com.spotify.music.features.yourlibrary.musicpages.pages.s;
import com.spotify.music.features.yourlibrary.musicpages.pages.y;

public class j1 {
    private final wlf<a39> a;
    private final wlf<gi9> b;
    private final wlf<q> c;
    private final wlf<s> d;
    private final wlf<y> e;
    private final wlf<x4> f;
    private final wlf<j79> g;
    private final wlf<r0> h;
    private final wlf<v0> i;
    private final wlf<e1> j;
    private final wlf<o> k;
    private final wlf<zc9> l;
    private final wlf<hg9> m;
    private final wlf<rg9> n;
    private final wlf<qg9> o;

    public j1(wlf<a39> wlf, wlf<gi9> wlf2, wlf<q> wlf3, wlf<s> wlf4, wlf<y> wlf5, wlf<x4> wlf6, wlf<j79> wlf7, wlf<r0> wlf8, wlf<v0> wlf9, wlf<e1> wlf10, wlf<o> wlf11, wlf<zc9> wlf12, wlf<hg9> wlf13, wlf<rg9> wlf14, wlf<qg9> wlf15) {
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
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    public i1 b(LayoutInflater layoutInflater, ViewGroup viewGroup, MusicPageId musicPageId, Bundle bundle, MusicPagesViewLoadingTrackerConnectable musicPagesViewLoadingTrackerConnectable) {
        a39 a39 = this.a.get();
        a(a39, 1);
        gi9 gi9 = this.b.get();
        a(gi9, 2);
        q qVar = this.c.get();
        a(qVar, 3);
        s sVar = this.d.get();
        a(sVar, 4);
        y yVar = this.e.get();
        a(yVar, 5);
        x4 x4Var = this.f.get();
        a(x4Var, 6);
        j79 j79 = this.g.get();
        a(j79, 7);
        r0 r0Var = this.h.get();
        a(r0Var, 8);
        v0 v0Var = this.i.get();
        a(v0Var, 9);
        e1 e1Var = this.j.get();
        a(e1Var, 10);
        o oVar = this.k.get();
        a(oVar, 11);
        zc9 zc9 = this.l.get();
        a(zc9, 12);
        zc9 zc92 = zc9;
        hg9 hg9 = this.m.get();
        a(hg9, 13);
        hg9 hg92 = hg9;
        rg9 rg9 = this.n.get();
        a(rg9, 14);
        rg9 rg92 = rg9;
        qg9 qg9 = this.o.get();
        a(qg9, 15);
        a(layoutInflater, 16);
        a(musicPageId, 18);
        a(musicPagesViewLoadingTrackerConnectable, 20);
        return new i1(a39, gi9, qVar, sVar, yVar, x4Var, j79, r0Var, v0Var, e1Var, oVar, zc92, hg92, rg92, qg9, layoutInflater, viewGroup, musicPageId, bundle, musicPagesViewLoadingTrackerConnectable);
    }
}
