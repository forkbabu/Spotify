package com.spotify.remoteconfig;

public final class t8 implements fjf<AndroidLibsNewplayingScrollWidgetsBtlProperties> {
    private final wlf<l0e> a;

    public t8(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidLibsNewplayingScrollWidgetsBtlProperties androidLibsNewplayingScrollWidgetsBtlProperties = (AndroidLibsNewplayingScrollWidgetsBtlProperties) this.a.get().a(l3.a);
        yif.g(androidLibsNewplayingScrollWidgetsBtlProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidLibsNewplayingScrollWidgetsBtlProperties;
    }
}
