package com.spotify.music.features.followfeed.views;

import com.squareup.picasso.Picasso;

public final class d implements fjf<c> {
    private final wlf<Picasso> a;

    public d(wlf<Picasso> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get());
    }
}
