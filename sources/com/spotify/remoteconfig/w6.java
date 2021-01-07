package com.spotify.remoteconfig;

public final class w6 implements fjf<AndroidFeatureSearchProperties> {
    private final wlf<l0e> a;

    public w6(wlf<l0e> wlf) {
        this.a = wlf;
    }

    public static AndroidFeatureSearchProperties a(l0e l0e) {
        AndroidFeatureSearchProperties androidFeatureSearchProperties = (AndroidFeatureSearchProperties) l0e.a(t3.a);
        yif.g(androidFeatureSearchProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidFeatureSearchProperties;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
