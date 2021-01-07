package com.spotify.mobile.android.util.ui;

import android.content.Context;
import com.squareup.picasso.Picasso;

public final class i implements fjf<h> {
    private final wlf<Context> a;
    private final wlf<Picasso> b;

    public i(wlf<Context> wlf, wlf<Picasso> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get());
    }
}
