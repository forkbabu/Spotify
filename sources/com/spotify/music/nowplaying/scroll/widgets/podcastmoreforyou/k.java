package com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou;

import com.spotify.mobile.android.hubframework.defaults.m;

public final class k implements fjf<a> {
    private final wlf<qlb> a;
    private final wlf<h> b;
    private final wlf<i61> c;
    private final wlf<m> d;

    public k(wlf<qlb> wlf, wlf<h> wlf2, wlf<i61> wlf3, wlf<m> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
