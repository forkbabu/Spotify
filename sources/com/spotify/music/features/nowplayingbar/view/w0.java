package com.spotify.music.features.nowplayingbar.view;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.libs.connect.nudge.b;
import com.spotify.mobile.android.util.ui.e;
import com.spotify.mobile.android.video.l0;
import com.spotify.music.libs.accountlinkingnudges.l;
import com.squareup.picasso.Picasso;

public final class w0 {
    private final wlf<Resources> a;
    private final wlf<l0> b;
    private final wlf<x0> c;
    private final wlf<st5> d;
    private final wlf<Picasso> e;
    private final wlf<e> f;
    private final wlf<q0> g;
    private final wlf<b> h;
    private final wlf<l> i;

    public w0(wlf<Resources> wlf, wlf<l0> wlf2, wlf<x0> wlf3, wlf<st5> wlf4, wlf<Picasso> wlf5, wlf<e> wlf6, wlf<q0> wlf7, wlf<b> wlf8, wlf<l> wlf9) {
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
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    public v0 b(LayoutInflater layoutInflater, ViewGroup viewGroup, da2<Boolean> da2) {
        a(layoutInflater, 1);
        a(da2, 3);
        Resources resources = this.a.get();
        a(resources, 4);
        Resources resources2 = resources;
        l0 l0Var = this.b.get();
        a(l0Var, 5);
        l0 l0Var2 = l0Var;
        x0 x0Var = this.c.get();
        a(x0Var, 6);
        x0 x0Var2 = x0Var;
        st5 st5 = this.d.get();
        a(st5, 7);
        st5 st52 = st5;
        Picasso picasso = this.e.get();
        a(picasso, 8);
        Picasso picasso2 = picasso;
        e eVar = this.f.get();
        a(eVar, 9);
        e eVar2 = eVar;
        q0 q0Var = this.g.get();
        a(q0Var, 10);
        q0 q0Var2 = q0Var;
        b bVar = this.h.get();
        a(bVar, 11);
        b bVar2 = bVar;
        l lVar = this.i.get();
        a(lVar, 12);
        return new v0(layoutInflater, viewGroup, da2, resources2, l0Var2, x0Var2, st52, picasso2, eVar2, q0Var2, bVar2, lVar);
    }
}
