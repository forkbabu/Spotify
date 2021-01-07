package com.spotify.music.libs.mediabrowserservice;

import com.spotify.music.libs.mediasession.e0;
import java.util.List;

public final class r2 implements fjf<q2> {
    private final wlf<t2> a;
    private final wlf<List<aja>> b;
    private final wlf<e0> c;

    public r2(wlf<t2> wlf, wlf<List<aja>> wlf2, wlf<e0> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q2(this.a.get(), this.b.get(), this.c.get());
    }
}
