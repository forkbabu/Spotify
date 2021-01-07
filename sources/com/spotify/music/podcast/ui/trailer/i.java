package com.spotify.music.podcast.ui.trailer;

import android.content.Context;
import com.squareup.picasso.Picasso;

public final class i implements fjf<h> {
    private final wlf<Picasso> a;
    private final wlf<Context> b;
    private final wlf<d> c;

    public i(wlf<Picasso> wlf, wlf<Context> wlf2, wlf<d> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get(), this.c.get());
    }
}
