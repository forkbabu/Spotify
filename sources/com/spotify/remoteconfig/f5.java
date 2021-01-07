package com.spotify.remoteconfig;

public final class f5 implements fjf<AndroidFeatureAllboardingProperties> {
    private final wlf<l0e> a;

    public f5(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidFeatureAllboardingProperties androidFeatureAllboardingProperties = (AndroidFeatureAllboardingProperties) this.a.get().a(r3.a);
        yif.g(androidFeatureAllboardingProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidFeatureAllboardingProperties;
    }
}
