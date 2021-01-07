package com.spotify.remoteconfig;

public final class f7 implements fjf<AndroidGoogleClockProperties> {
    private final wlf<l0e> a;

    public f7(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidGoogleClockProperties androidGoogleClockProperties = (AndroidGoogleClockProperties) this.a.get().a(d0.a);
        yif.g(androidGoogleClockProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidGoogleClockProperties;
    }
}
