package com.spotify.music.libs.assistedcuration.provider;

import com.google.common.collect.ImmutableList;
import com.spotify.playlist.models.o;

public final class d0 implements fjf<c0> {
    private final wlf<h0> a;
    private final wlf<l0> b;
    private final wlf<x0> c;
    private final wlf<t0> d;
    private final wlf<p0> e;
    private final wlf<g62<o>> f;
    private final wlf<ImmutableList<String>> g;

    public d0(wlf<h0> wlf, wlf<l0> wlf2, wlf<x0> wlf3, wlf<t0> wlf4, wlf<p0> wlf5, wlf<g62<o>> wlf6, wlf<ImmutableList<String>> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    public static d0 a(wlf<h0> wlf, wlf<l0> wlf2, wlf<x0> wlf3, wlf<t0> wlf4, wlf<p0> wlf5, wlf<g62<o>> wlf6, wlf<ImmutableList<String>> wlf7) {
        return new d0(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
