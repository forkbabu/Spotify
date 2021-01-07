package com.spotify.effortlesslogin.backend;

import com.spotify.http.w;
import com.spotify.music.json.g;

public final class f implements fjf<e> {
    private final wlf<w> a;
    private final wlf<g> b;

    public f(wlf<w> wlf, wlf<g> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get());
    }
}
