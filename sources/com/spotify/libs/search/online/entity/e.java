package com.spotify.libs.search.online.entity;

import io.reactivex.s;

public final class e implements fjf<d> {
    private final wlf<s<b>> a;

    public e(wlf<s<b>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get());
    }
}
