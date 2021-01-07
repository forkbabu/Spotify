package com.spotify.music.carmodehome.shelf;

import com.squareup.picasso.Picasso;

public final class e implements fjf<d> {
    private final wlf<Picasso> a;
    private final wlf<cs2> b;

    public e(wlf<Picasso> wlf, wlf<cs2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a, this.b);
    }
}
