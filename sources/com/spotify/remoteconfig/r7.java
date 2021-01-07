package com.spotify.remoteconfig;

public final class r7 implements fjf<AndroidLibsAllboardingProperties> {
    private final wlf<l0e> a;

    public r7(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidLibsAllboardingProperties androidLibsAllboardingProperties = (AndroidLibsAllboardingProperties) this.a.get().a(x0.a);
        yif.g(androidLibsAllboardingProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidLibsAllboardingProperties;
    }
}
