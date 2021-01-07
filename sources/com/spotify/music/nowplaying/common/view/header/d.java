package com.spotify.music.nowplaying.common.view.header;

import com.spotify.music.navigation.t;
import com.spotify.music.nowplaying.core.navcontext.f;
import io.reactivex.g;

public final class d implements fjf<c> {
    private final wlf<g<f>> a;
    private final wlf<t> b;
    private final wlf<erd> c;
    private final wlf<asb> d;

    public d(wlf<g<f>> wlf, wlf<t> wlf2, wlf<erd> wlf3, wlf<asb> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
