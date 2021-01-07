package com.spotify.music.carmode.navigation;

import io.reactivex.s;
import io.reactivex.y;

public final class p implements fjf<o> {
    private final wlf<vgb> a;
    private final wlf<s<d7a>> b;
    private final wlf<y> c;
    private final wlf<y> d;
    private final wlf<com.spotify.music.libs.carmodeengine.util.y> e;

    public p(wlf<vgb> wlf, wlf<s<d7a>> wlf2, wlf<y> wlf3, wlf<y> wlf4, wlf<com.spotify.music.libs.carmodeengine.util.y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
