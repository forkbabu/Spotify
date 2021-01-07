package com.spotify.remoteconfig;

public final class q7 implements fjf<AndroidLibsAdsCommonProperties> {
    private final wlf<l0e> a;

    public q7(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidLibsAdsCommonProperties androidLibsAdsCommonProperties = (AndroidLibsAdsCommonProperties) this.a.get().a(t2.a);
        yif.g(androidLibsAdsCommonProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidLibsAdsCommonProperties;
    }
}
