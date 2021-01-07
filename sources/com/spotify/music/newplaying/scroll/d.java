package com.spotify.music.newplaying.scroll;

import io.reactivex.g;

public final class d implements fjf<c> {
    private final wlf<g<String>> a;

    public d(wlf<g<String>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get());
    }
}
