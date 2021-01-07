package com.spotify.player.di;

import defpackage.bxd;

public final class f implements fjf<bxd.a> {
    private final wlf<h> a;

    public f(wlf<h> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get());
    }
}
