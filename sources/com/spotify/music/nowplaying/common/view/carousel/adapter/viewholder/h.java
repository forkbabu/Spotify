package com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder;

import android.view.LayoutInflater;
import androidx.lifecycle.n;
import com.spotify.mobile.android.video.g0;
import com.spotify.mobile.android.video.q;
import com.spotify.mobile.android.video.s;
import com.squareup.picasso.Picasso;

public final class h implements fjf<g> {
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

    public h(wlf<LayoutInflater> wlf, wlf<s> wlf2, wlf<l72> wlf3, wlf<g0> wlf4, wlf<pl2> wlf5, wlf<q> wlf6, wlf<km2> wlf7, wlf<mm2> wlf8, wlf<Picasso> wlf9, wlf<xl2> wlf10, wlf<n> wlf11) {
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
    }

    public static h a(wlf<LayoutInflater> wlf, wlf<s> wlf2, wlf<l72> wlf3, wlf<g0> wlf4, wlf<pl2> wlf5, wlf<q> wlf6, wlf<km2> wlf7, wlf<mm2> wlf8, wlf<Picasso> wlf9, wlf<xl2> wlf10, wlf<n> wlf11) {
        return new h(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10, wlf11);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }
}
