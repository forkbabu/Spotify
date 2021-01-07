package com.spotify.music.libs.assistedcuration;

import com.spotify.music.libs.viewuri.c;

public final class g implements fjf<f> {
    private final wlf<jz1> a;
    private final wlf<c> b;
    private final wlf<cqe> c;

    public g(wlf<jz1> wlf, wlf<c> wlf2, wlf<cqe> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get(), this.b.get(), this.c.get());
    }
}
