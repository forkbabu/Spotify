package com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.n;
import com.spotify.mobile.android.video.g0;
import com.spotify.mobile.android.video.q;
import com.spotify.mobile.android.video.s;
import com.squareup.picasso.Picasso;

public final class g {
    private final wlf<LayoutInflater> a;
    private final wlf<s> b;
    private final wlf<l72> c;
    private final wlf<g0> d;
    private final wlf<pl2> e;
    private final wlf<q> f;
    private final wlf<km2> g;
    private final wlf<mm2> h;
    private final wlf<Picasso> i;
    private final wlf<xl2> j;
    private final wlf<n> k;

    public g(wlf<LayoutInflater> wlf, wlf<s> wlf2, wlf<l72> wlf3, wlf<g0> wlf4, wlf<pl2> wlf5, wlf<q> wlf6, wlf<km2> wlf7, wlf<mm2> wlf8, wlf<Picasso> wlf9, wlf<xl2> wlf10, wlf<n> wlf11) {
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
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    public f b(ViewGroup viewGroup) {
        LayoutInflater layoutInflater = this.a.get();
        a(layoutInflater, 1);
        LayoutInflater layoutInflater2 = layoutInflater;
        s sVar = this.b.get();
        a(sVar, 2);
        s sVar2 = sVar;
        l72 l72 = this.c.get();
        a(l72, 3);
        l72 l722 = l72;
        g0 g0Var = this.d.get();
        a(g0Var, 4);
        g0 g0Var2 = g0Var;
        pl2 pl2 = this.e.get();
        a(pl2, 5);
        pl2 pl22 = pl2;
        q qVar = this.f.get();
        a(qVar, 6);
        q qVar2 = qVar;
        km2 km2 = this.g.get();
        a(km2, 7);
        km2 km22 = km2;
        mm2 mm2 = this.h.get();
        a(mm2, 8);
        mm2 mm22 = mm2;
        Picasso picasso = this.i.get();
        a(picasso, 9);
        a(viewGroup, 10);
        ViewGroup viewGroup2 = viewGroup;
        xl2 xl2 = this.j.get();
        a(xl2, 11);
        xl2 xl22 = xl2;
        n nVar = this.k.get();
        a(nVar, 12);
        return new f(layoutInflater2, sVar2, l722, g0Var2, pl22, qVar2, km22, mm22, picasso, viewGroup2, xl22, nVar);
    }
}
