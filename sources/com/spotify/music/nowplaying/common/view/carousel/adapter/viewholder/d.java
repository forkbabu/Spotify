package com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.n;
import com.squareup.picasso.Picasso;

public final class d {
    private final wlf<LayoutInflater> a;
    private final wlf<pl2> b;
    private final wlf<Picasso> c;
    private final wlf<km2> d;
    private final wlf<mm2> e;
    private final wlf<n> f;

    public d(wlf<LayoutInflater> wlf, wlf<pl2> wlf2, wlf<Picasso> wlf3, wlf<km2> wlf4, wlf<mm2> wlf5, wlf<n> wlf6) {
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
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public c b(ViewGroup viewGroup) {
        LayoutInflater layoutInflater = this.a.get();
        a(layoutInflater, 1);
        LayoutInflater layoutInflater2 = layoutInflater;
        pl2 pl2 = this.b.get();
        a(pl2, 2);
        pl2 pl22 = pl2;
        Picasso picasso = this.c.get();
        a(picasso, 3);
        Picasso picasso2 = picasso;
        km2 km2 = this.d.get();
        a(km2, 4);
        km2 km22 = km2;
        mm2 mm2 = this.e.get();
        a(mm2, 5);
        mm2 mm22 = mm2;
        n nVar = this.f.get();
        a(nVar, 6);
        a(viewGroup, 7);
        return new c(layoutInflater2, pl22, picasso2, km22, mm22, nVar, viewGroup);
    }
}
