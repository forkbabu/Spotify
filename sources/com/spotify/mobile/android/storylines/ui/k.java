package com.spotify.mobile.android.storylines.ui;

import com.squareup.picasso.Picasso;

public final class k implements fjf<j> {
    private final wlf<Picasso> a;

    public k(wlf<Picasso> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a.get());
    }
}
