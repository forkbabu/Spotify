package com.spotify.music.libs.mediabrowserservice;

import com.spotify.mobile.android.service.media.b3;
import com.spotify.music.genie.p;
import com.spotify.music.libs.audio.focus.o;
import com.spotify.music.libs.external_integration.instrumentation.d;
import com.spotify.music.libs.mediasession.e0;

public final class k1 implements fjf<j1> {
    private final wlf<cqe> a;
    private final wlf<d> b;
    private final wlf<pea> c;
    private final wlf<e0> d;
    private final wlf<p> e;
    private final wlf<b3> f;
    private final wlf<l1> g;
    private final wlf<o> h;
    private final wlf<v1> i;

    public k1(wlf<cqe> wlf, wlf<d> wlf2, wlf<pea> wlf3, wlf<e0> wlf4, wlf<p> wlf5, wlf<b3> wlf6, wlf<l1> wlf7, wlf<o> wlf8, wlf<v1> wlf9) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}
