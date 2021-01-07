package com.spotify.music.marquee;

import androidx.fragment.app.c;

public final class k implements fjf<j> {
    private final wlf<c> a;
    private final wlf<Boolean> b;

    public k(wlf<c> wlf, wlf<Boolean> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a.get(), this.b.get().booleanValue());
    }
}
