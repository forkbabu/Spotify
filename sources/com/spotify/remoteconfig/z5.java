package com.spotify.remoteconfig;

public final class z5 implements fjf<AndroidFeatureHomeProperties> {
    private final wlf<l0e> a;

    public z5(wlf<l0e> wlf) {
        this.a = wlf;
    }

    public static AndroidFeatureHomeProperties a(l0e l0e) {
        AndroidFeatureHomeProperties androidFeatureHomeProperties = (AndroidFeatureHomeProperties) l0e.a(d3.a);
        yif.g(androidFeatureHomeProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidFeatureHomeProperties;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
