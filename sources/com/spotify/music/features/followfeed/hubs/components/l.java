package com.spotify.music.features.followfeed.hubs.components;

import com.spotify.music.features.followfeed.mobius.b;
import com.squareup.picasso.Picasso;

public final class l implements fjf<k> {
    private final wlf<Picasso> a;
    private final wlf<b> b;
    private final wlf<f45> c;

    public l(wlf<Picasso> wlf, wlf<b> wlf2, wlf<f45> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k(this.a.get(), this.b.get(), this.c.get());
    }
}
