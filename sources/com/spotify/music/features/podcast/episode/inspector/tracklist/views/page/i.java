package com.spotify.music.features.podcast.episode.inspector.tracklist.views.page;

import android.content.Context;
import com.spotify.music.features.podcast.episode.inspector.tracklist.views.page.g;
import com.squareup.picasso.Picasso;

public final class i implements fjf<h> {
    private final wlf<Context> a;
    private final wlf<q97> b;
    private final wlf<Picasso> c;
    private final wlf<g.a> d;

    public i(wlf<Context> wlf, wlf<q97> wlf2, wlf<Picasso> wlf3, wlf<g.a> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get(), this.c.get(), ejf.a(this.d));
    }
}
