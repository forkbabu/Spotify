package com.spotify.music.newplaying.scroll;

import com.spotify.nowplaying.core.immersive.c;

public final class f implements fjf<e> {
    private final wlf<omb> a;
    private final wlf<c> b;
    private final wlf<c> c;
    private final wlf<g> d;
    private final wlf<jmb> e;

    public f(wlf<omb> wlf, wlf<c> wlf2, wlf<c> wlf3, wlf<g> wlf4, wlf<jmb> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static f a(wlf<omb> wlf, wlf<c> wlf2, wlf<c> wlf3, wlf<g> wlf4, wlf<jmb> wlf5) {
        return new f(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
