package com.spotify.music.explicitcontent;

import androidx.lifecycle.n;
import io.reactivex.y;

public final class i implements fjf<ExplicitContentFacade> {
    private final wlf<f> a;
    private final wlf<vg3> b;
    private final wlf<y> c;
    private final wlf<n> d;

    public i(wlf<f> wlf, wlf<vg3> wlf2, wlf<y> wlf3, wlf<n> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ExplicitContentFacade(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
