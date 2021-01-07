package com.spotify.music.libs.search.hubs.util.image;

import android.content.Context;
import com.squareup.picasso.Picasso;

public final class d implements fjf<c> {
    private final wlf<Context> a;
    private final wlf<Picasso> b;
    private final wlf<e> c;

    public d(wlf<Context> wlf, wlf<Picasso> wlf2, wlf<e> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get());
    }
}
