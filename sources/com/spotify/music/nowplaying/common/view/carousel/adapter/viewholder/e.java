package com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder;

import android.view.LayoutInflater;
import androidx.lifecycle.n;
import com.squareup.picasso.Picasso;

public final class e implements fjf<d> {
    private final wlf<LayoutInflater> a;
    private final wlf<pl2> b;
    private final wlf<Picasso> c;
    private final wlf<km2> d;
    private final wlf<mm2> e;
    private final wlf<n> f;

    public e(wlf<LayoutInflater> wlf, wlf<pl2> wlf2, wlf<Picasso> wlf3, wlf<km2> wlf4, wlf<mm2> wlf5, wlf<n> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static e a(wlf<LayoutInflater> wlf, wlf<pl2> wlf2, wlf<Picasso> wlf3, wlf<km2> wlf4, wlf<mm2> wlf5, wlf<n> wlf6) {
        return new e(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
