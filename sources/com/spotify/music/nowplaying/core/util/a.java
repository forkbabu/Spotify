package com.spotify.music.nowplaying.core.util;

import com.squareup.picasso.Picasso;

public final class a implements fjf<CoverArtFetcher> {
    private final wlf<Picasso> a;

    public a(wlf<Picasso> wlf) {
        this.a = wlf;
    }

    public static CoverArtFetcher a(Picasso picasso) {
        return new CoverArtFetcher(picasso);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new CoverArtFetcher(this.a.get());
    }
}
