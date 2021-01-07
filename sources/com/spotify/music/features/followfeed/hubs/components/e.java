package com.spotify.music.features.followfeed.hubs.components;

import com.spotify.music.features.followfeed.mobius.b;
import com.squareup.picasso.Picasso;

public final class e implements fjf<c> {
    private final wlf<Picasso> a;
    private final wlf<b> b;
    private final wlf<Integer> c;
    private final wlf<f45> d;

    public e(wlf<Picasso> wlf, wlf<b> wlf2, wlf<Integer> wlf3, wlf<f45> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get().intValue(), this.d.get());
    }
}
