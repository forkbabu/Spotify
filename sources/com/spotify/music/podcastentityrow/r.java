package com.spotify.music.podcastentityrow;

import com.spotify.instrumentation.a;
import com.spotify.ubi.specification.factories.a3;

public final class r implements fjf<a3> {
    private final wlf<a> a;

    public r(wlf<a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a3(this.a.get().path());
    }
}
