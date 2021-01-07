package com.spotify.music.playlist.ui;

import android.content.Context;
import com.spotify.music.libs.viewuri.c;
import com.squareup.picasso.Picasso;

public final class z<T> implements fjf<y<T>> {
    private final wlf<Context> a;
    private final wlf<c> b;
    private final wlf<Picasso> c;

    public z(wlf<Context> wlf, wlf<c> wlf2, wlf<Picasso> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new y(this.a.get(), this.b.get(), this.c.get());
    }
}
