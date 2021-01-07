package com.spotify.music.navigation;

import androidx.fragment.app.c;

public final class s implements fjf<q> {
    private final wlf<c> a;
    private final wlf<Integer> b;
    private final wlf<jz1> c;
    private final wlf<cqe> d;

    public s(wlf<c> wlf, wlf<Integer> wlf2, wlf<jz1> wlf3, wlf<cqe> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q(this.a.get(), this.b.get().intValue(), this.c.get(), this.d.get());
    }
}
