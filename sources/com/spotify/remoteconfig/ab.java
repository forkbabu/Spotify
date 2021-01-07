package com.spotify.remoteconfig;

public final class ab implements fjf<AndroidLibsSocialListeningProperties> {
    private final wlf<l0e> a;

    public ab(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidLibsSocialListeningProperties androidLibsSocialListeningProperties = (AndroidLibsSocialListeningProperties) this.a.get().a(i.a);
        yif.g(androidLibsSocialListeningProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidLibsSocialListeningProperties;
    }
}
