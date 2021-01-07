package com.spotify.music.features.search.mobius;

import com.spotify.remoteconfig.AndroidFeatureSearchProperties;

public final class k0 implements fjf<Boolean> {
    private final wlf<AndroidFeatureSearchProperties> a;

    public k0(wlf<AndroidFeatureSearchProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().d());
    }
}
