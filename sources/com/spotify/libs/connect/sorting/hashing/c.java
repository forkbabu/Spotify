package com.spotify.libs.connect.sorting.hashing;

import com.spotify.libs.connect.providers.p;

public final class c implements fjf<b> {
    private final wlf<d> a;
    private final wlf<p> b;

    public c(wlf<d> wlf, wlf<p> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.b.get());
    }
}
