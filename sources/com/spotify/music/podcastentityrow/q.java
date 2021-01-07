package com.spotify.music.podcastentityrow;

import com.spotify.instrumentation.a;
import com.spotify.ubi.specification.factories.x2;

public final class q implements fjf<x2> {
    private final wlf<a> a;

    public q(wlf<a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        a aVar = this.a.get();
        return new x2(aVar.d(), aVar.path());
    }
}
