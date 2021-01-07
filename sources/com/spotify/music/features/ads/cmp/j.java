package com.spotify.music.features.ads.cmp;

import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;

public final class j implements fjf<i> {
    private final wlf<AndroidLibsAdsCommonProperties> a;

    public j(wlf<AndroidLibsAdsCommonProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get());
    }
}
