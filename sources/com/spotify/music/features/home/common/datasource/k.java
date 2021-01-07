package com.spotify.music.features.home.common.datasource;

import com.spotify.music.json.e;
import com.spotify.remoteconfig.AndroidFeatureHomeProperties;

public final class k implements fjf<j> {
    private final wlf<e> a;
    private final wlf<AndroidFeatureHomeProperties> b;

    public k(wlf<e> wlf, wlf<AndroidFeatureHomeProperties> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a.get(), this.b.get());
    }
}
