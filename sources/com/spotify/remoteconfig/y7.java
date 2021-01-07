package com.spotify.remoteconfig;

public final class y7 implements fjf<AndroidLibsCarDetectionProperties> {
    private final wlf<l0e> a;

    public y7(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidLibsCarDetectionProperties androidLibsCarDetectionProperties = (AndroidLibsCarDetectionProperties) this.a.get().a(d2.a);
        yif.g(androidLibsCarDetectionProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidLibsCarDetectionProperties;
    }
}
