package com.spotify.music.nowplaying.podcast.mixedmedia.ui.card;

import com.squareup.picasso.Picasso;

public final class i implements fjf<h> {
    private final wlf<Picasso> a;
    private final wlf<h1c> b;
    private final wlf<y0c> c;
    private final wlf<a> d;

    public i(wlf<Picasso> wlf, wlf<h1c> wlf2, wlf<y0c> wlf3, wlf<a> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
