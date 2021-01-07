package com.spotify.music.features.followfeed.hubs.components;

import com.squareup.picasso.Picasso;

public final class b implements fjf<a> {
    private final wlf<Picasso> a;
    private final wlf<com.spotify.music.features.followfeed.mobius.b> b;
    private final wlf<f45> c;

    public b(wlf<Picasso> wlf, wlf<com.spotify.music.features.followfeed.mobius.b> wlf2, wlf<f45> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.b.get(), this.c.get());
    }
}
