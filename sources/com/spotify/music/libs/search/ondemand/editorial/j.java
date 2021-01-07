package com.spotify.music.libs.search.ondemand.editorial;

import com.spotify.music.libs.search.ondemand.editorial.cache.a;

public final class j implements fjf<i> {
    private final wlf<cqe> a;
    private final wlf<a> b;

    public j(wlf<cqe> wlf, wlf<a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get(), this.b.get());
    }
}
