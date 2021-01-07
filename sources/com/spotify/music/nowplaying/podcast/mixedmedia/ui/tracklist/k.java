package com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist;

import android.content.Context;
import com.squareup.picasso.Picasso;

public final class k implements fjf<j> {
    private final wlf<Context> a;
    private final wlf<h1c> b;
    private final wlf<Picasso> c;
    private final wlf<z1c> d;
    private final wlf<f1c> e;

    public k(wlf<Context> wlf, wlf<h1c> wlf2, wlf<Picasso> wlf3, wlf<z1c> wlf4, wlf<f1c> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
