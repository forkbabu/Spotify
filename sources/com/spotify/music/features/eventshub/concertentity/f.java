package com.spotify.music.features.eventshub.concertentity;

import com.spotify.music.libs.viewuri.c;

public final class f implements fjf<p71> {
    private final wlf<jz1> a;
    private final wlf<ifd> b;
    private final wlf<c.a> c;
    private final wlf<cqe> d;

    public f(wlf<jz1> wlf, wlf<ifd> wlf2, wlf<c.a> wlf3, wlf<cqe> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q71(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
