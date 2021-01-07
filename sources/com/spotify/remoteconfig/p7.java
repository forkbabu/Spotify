package com.spotify.remoteconfig;

public final class p7 implements fjf<AndroidLibsAdaptiveUiProperties> {
    private final wlf<l0e> a;

    public p7(wlf<l0e> wlf) {
        this.a = wlf;
    }

    public static AndroidLibsAdaptiveUiProperties a(l0e l0e) {
        AndroidLibsAdaptiveUiProperties androidLibsAdaptiveUiProperties = (AndroidLibsAdaptiveUiProperties) l0e.a(i1.a);
        yif.g(androidLibsAdaptiveUiProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidLibsAdaptiveUiProperties;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
