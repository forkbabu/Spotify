package com.spotify.music.features.search.mobius;

import com.spotify.libs.search.history.i;
import com.spotify.libs.search.history.p;

public final class g0 implements fjf<i> {
    private final wlf<p> a;

    public g0(wlf<p> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get());
    }
}
