package com.spotify.player.internal;

public final class b implements fjf<a> {
    private final wlf<cqe> a;

    public b(wlf<cqe> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get());
    }
}
