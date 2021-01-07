package com.spotify.music.libs.voice;

import com.squareup.picasso.Picasso;

public final class d implements fjf<c> {
    private final wlf<Picasso> a;

    public d(wlf<Picasso> wlf) {
        this.a = wlf;
    }

    public static c a(Picasso picasso) {
        return new c(picasso);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get());
    }
}
