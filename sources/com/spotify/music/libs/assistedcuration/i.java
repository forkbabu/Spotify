package com.spotify.music.libs.assistedcuration;

import com.spotify.music.libs.viewuri.c;

public final class i implements fjf<h> {
    private final wlf<jz1> a;
    private final wlf<c> b;
    private final wlf<cqe> c;

    public i(wlf<jz1> wlf, wlf<c> wlf2, wlf<cqe> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get(), this.c.get());
    }
}
