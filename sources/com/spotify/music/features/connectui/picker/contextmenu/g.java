package com.spotify.music.features.connectui.picker.contextmenu;

import com.spotify.libs.connect.instrumentation.e;
import com.spotify.music.features.connectui.picker.legacy.util.d;
import com.squareup.picasso.Picasso;

public final class g implements fjf<f> {
    private final wlf<Picasso> a;
    private final wlf<d> b;
    private final wlf<e> c;

    public g(wlf<Picasso> wlf, wlf<d> wlf2, wlf<e> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get(), this.b.get(), this.c.get());
    }
}
