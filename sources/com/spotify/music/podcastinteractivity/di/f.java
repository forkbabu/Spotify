package com.spotify.music.podcastinteractivity.di;

import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.c;
import com.spotify.ubi.specification.factories.v2;

public final class f implements fjf<v2> {
    private final wlf<a> a;
    private final wlf<c> b;

    public f(wlf<a> wlf, wlf<c> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v2(this.a.get().path(), this.b.get().toString());
    }
}
