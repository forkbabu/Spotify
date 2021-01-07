package com.spotify.remoteconfig;

public final class p5 implements fjf<AndroidFeatureDrivingJumpstartProperties> {
    private final wlf<l0e> a;

    public p5(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidFeatureDrivingJumpstartProperties androidFeatureDrivingJumpstartProperties = (AndroidFeatureDrivingJumpstartProperties) this.a.get().a(i2.a);
        yif.g(androidFeatureDrivingJumpstartProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidFeatureDrivingJumpstartProperties;
    }
}
