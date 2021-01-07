package com.spotify.mobile.android.service.media.search;

import com.spotify.mobile.android.rx.w;
import com.spotify.music.connection.l;

public final class g implements fjf<f> {
    private final wlf<j> a;
    private final wlf<w> b;
    private final wlf<l> c;
    private final wlf<lz0> d;

    public g(wlf<j> wlf, wlf<w> wlf2, wlf<l> wlf3, wlf<lz0> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
