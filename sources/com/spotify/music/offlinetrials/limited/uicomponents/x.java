package com.spotify.music.offlinetrials.limited.uicomponents;

import com.spotify.music.navigation.t;

public final class x implements fjf<w> {
    private final wlf<u> a;
    private final wlf<t> b;
    private final wlf<y> c;

    public x(wlf<u> wlf, wlf<t> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w(this.a.get(), this.b.get(), this.c.get());
    }
}
