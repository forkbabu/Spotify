package com.spotify.music.features.yourlibrary.musicpages;

import com.spotify.music.libs.viewuri.c;

public final class l1 implements fjf<k1> {
    private final wlf<kpd> a;
    private final wlf<c.a> b;
    private final wlf<i79> c;

    public l1(wlf<kpd> wlf, wlf<c.a> wlf2, wlf<i79> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k1(this.a.get(), this.b.get(), this.c.get());
    }
}
