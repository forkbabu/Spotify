package com.spotify.music.features.datasavermode.settings;

import com.spotify.music.libs.viewuri.c;

public final class f implements fjf<e> {
    private final wlf<jz1> a;
    private final wlf<cqe> b;
    private final wlf<c> c;

    public f(wlf<jz1> wlf, wlf<cqe> wlf2, wlf<c> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get(), this.c.get());
    }
}
