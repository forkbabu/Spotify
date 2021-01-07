package com.spotify.music.sociallistening.facepile;

import android.content.Context;
import com.squareup.picasso.Picasso;

public final class f implements fjf<d> {
    private final wlf<Context> a;
    private final wlf<Picasso> b;
    private final wlf<a> c;
    private final wlf<lqa> d;

    public f(wlf<Context> wlf, wlf<Picasso> wlf2, wlf<a> wlf3, wlf<lqa> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
