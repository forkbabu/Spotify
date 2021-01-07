package com.spotify.music.connection;

import io.reactivex.s;

public final class m implements fjf<l> {
    private final wlf<s<g>> a;

    public m(wlf<s<g>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a.get());
    }
}
