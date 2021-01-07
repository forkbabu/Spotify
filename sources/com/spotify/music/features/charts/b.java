package com.spotify.music.features.charts;

import android.app.Activity;
import com.squareup.picasso.Picasso;

public final class b implements fjf<a> {
    private final wlf<Activity> a;
    private final wlf<Picasso> b;

    public b(wlf<Activity> wlf, wlf<Picasso> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.b.get());
    }
}
