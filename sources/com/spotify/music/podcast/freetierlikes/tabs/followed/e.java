package com.spotify.music.podcast.freetierlikes.tabs.followed;

import android.content.Context;
import com.squareup.picasso.Picasso;

public final class e implements fjf<d> {
    private final wlf<Context> a;
    private final wlf<Picasso> b;
    private final wlf<una> c;

    public e(wlf<Context> wlf, wlf<Picasso> wlf2, wlf<una> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get(), this.b.get(), this.c.get());
    }
}
