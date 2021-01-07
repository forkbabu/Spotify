package com.spotify.music.libs.mediabrowserservice;

import com.spotify.music.libs.mediasession.m0;
import java.util.Set;

public final class i2 implements fjf<h2> {
    private final wlf<m0> a;
    private final wlf<o2> b;
    private final wlf<q2> c;
    private final wlf<x2> d;
    private final wlf<Set<u1>> e;

    public i2(wlf<m0> wlf, wlf<o2> wlf2, wlf<q2> wlf3, wlf<x2> wlf4, wlf<Set<u1>> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h2(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
