package com.spotify.music.features.browse.localcache;

import com.spotify.music.json.e;

public final class j implements fjf<i> {
    private final wlf<e> a;

    public j(wlf<e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get());
    }
}
