package com.spotify.http;

import com.spotify.http.wg.WebgateTokenProvider;
import com.spotify.http.wg.b;
import java.util.Set;
import okhttp3.v;

public final class x implements fjf<w> {
    private final wlf<WebgateTokenProvider> a;
    private final wlf<cqe> b;
    private final wlf<q> c;
    private final wlf<q> d;
    private final wlf<b> e;
    private final wlf<t> f;
    private final wlf<Set<v>> g;
    private final wlf<Set<v>> h;

    public x(wlf<WebgateTokenProvider> wlf, wlf<cqe> wlf2, wlf<q> wlf3, wlf<q> wlf4, wlf<b> wlf5, wlf<t> wlf6, wlf<Set<v>> wlf7, wlf<Set<v>> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w(this.a, this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
