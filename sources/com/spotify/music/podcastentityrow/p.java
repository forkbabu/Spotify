package com.spotify.music.podcastentityrow;

import com.spotify.instrumentation.a;
import com.spotify.ubi.specification.factories.s2;

public final class p implements fjf<s2> {
    private final wlf<a> a;

    public p(wlf<a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s2(this.a.get().path());
    }
}
