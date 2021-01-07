package com.spotify.music.features.queue.logging;

public final class b implements fjf<a> {
    private final wlf<mba> a;

    public b(wlf<mba> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get());
    }
}
