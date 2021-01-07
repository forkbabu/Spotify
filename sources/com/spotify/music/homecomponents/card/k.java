package com.spotify.music.homecomponents.card;

import android.content.Context;
import com.squareup.picasso.Picasso;

public final class k implements fjf<j> {
    private final wlf<Context> a;
    private final wlf<Picasso> b;
    private final wlf<po9> c;
    private final wlf<m71> d;
    private final wlf<w50> e;

    public k(wlf<Context> wlf, wlf<Picasso> wlf2, wlf<po9> wlf3, wlf<m71> wlf4, wlf<w50> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static k a(wlf<Context> wlf, wlf<Picasso> wlf2, wlf<po9> wlf3, wlf<m71> wlf4, wlf<w50> wlf5) {
        return new k(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
