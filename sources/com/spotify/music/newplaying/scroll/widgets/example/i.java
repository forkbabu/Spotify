package com.spotify.music.newplaying.scroll.widgets.example;

import com.squareup.picasso.Picasso;

public final class i implements fjf<c> {
    private final wlf<f> a;
    private final wlf<Picasso> b;
    private final wlf<qlb> c;

    public i(wlf<f> wlf, wlf<Picasso> wlf2, wlf<qlb> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get());
    }
}
