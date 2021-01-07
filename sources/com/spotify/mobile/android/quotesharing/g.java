package com.spotify.mobile.android.quotesharing;

import com.spotify.mobile.android.share.menu.preview.api.e;
import com.squareup.picasso.Picasso;

public final class g implements fjf<f> {
    private final wlf<e> a;
    private final wlf<cb1> b;
    private final wlf<Picasso> c;

    public g(wlf<e> wlf, wlf<cb1> wlf2, wlf<Picasso> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get(), this.b.get(), this.c.get());
    }
}
