package com.spotify.music.carmode.nowplaying.def.view.repeat;

import com.spotify.music.libs.carmodeengine.util.y;

public final class c implements fjf<b> {
    private final wlf<e> a;
    private final wlf<y> b;

    public c(wlf<e> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.b.get());
    }
}
