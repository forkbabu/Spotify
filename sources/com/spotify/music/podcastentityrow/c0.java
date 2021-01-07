package com.spotify.music.podcastentityrow;

import com.squareup.picasso.Picasso;

public final class c0 implements fjf<b0> {
    private final wlf<Picasso> a;

    public c0(wlf<Picasso> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b0(this.a.get());
    }
}
