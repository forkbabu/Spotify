package com.spotify.music.playlist.ui;

import com.spotify.music.preview.q;
import com.squareup.picasso.Picasso;

public final class o0<T> implements fjf<n0<T>> {
    private final wlf<Picasso> a;
    private final wlf<h0> b;
    private final wlf<htc> c;
    private final wlf<jtc> d;
    private final wlf<Boolean> e;
    private final wlf<y<T>> f;
    private final wlf<q> g;
    private final wlf<lbb> h;

    public o0(wlf<Picasso> wlf, wlf<h0> wlf2, wlf<htc> wlf3, wlf<jtc> wlf4, wlf<Boolean> wlf5, wlf<y<T>> wlf6, wlf<q> wlf7, wlf<lbb> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    public static <T> o0<T> a(wlf<Picasso> wlf, wlf<h0> wlf2, wlf<htc> wlf3, wlf<jtc> wlf4, wlf<Boolean> wlf5, wlf<y<T>> wlf6, wlf<q> wlf7, wlf<lbb> wlf8) {
        return new o0<>(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
