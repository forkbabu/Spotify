package com.spotify.music.carmodehome.shortcuts;

import com.squareup.picasso.Picasso;

public final class c implements fjf<b> {
    private final wlf<Picasso> a;
    private final wlf<cs2> b;

    public c(wlf<Picasso> wlf, wlf<cs2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a, this.b);
    }
}
