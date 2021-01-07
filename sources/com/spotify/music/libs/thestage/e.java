package com.spotify.music.libs.thestage;

import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;

public final class e implements fjf<d> {
    private final wlf<AndroidLibsAdsCommonProperties> a;

    public e(wlf<AndroidLibsAdsCommonProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get());
    }
}
