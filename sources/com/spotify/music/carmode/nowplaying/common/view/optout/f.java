package com.spotify.music.carmode.nowplaying.common.view.optout;

import com.spotify.music.libs.carmodeengine.util.y;

public final class f implements fjf<e> {
    private final wlf<to2> a;
    private final wlf<h> b;
    private final wlf<y> c;
    private final wlf<io.reactivex.y> d;

    public f(wlf<to2> wlf, wlf<h> wlf2, wlf<y> wlf3, wlf<io.reactivex.y> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
