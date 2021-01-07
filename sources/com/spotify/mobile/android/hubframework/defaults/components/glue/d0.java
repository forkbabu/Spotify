package com.spotify.mobile.android.hubframework.defaults.components.glue;

import com.squareup.picasso.Picasso;

public final class d0 implements fjf<c0> {
    private final wlf<Picasso> a;
    private final wlf<Boolean> b;

    public d0(wlf<Picasso> wlf, wlf<Boolean> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c0(this.a.get(), this.b.get().booleanValue());
    }
}
