package com.spotify.music.features.freetierartist.datasource;

import com.spotify.music.json.e;

public final class x implements fjf<w> {
    private final wlf<e> a;

    public x(wlf<e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w(this.a.get());
    }
}
