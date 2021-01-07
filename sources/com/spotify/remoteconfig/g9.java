package com.spotify.remoteconfig;

public final class g9 implements fjf<AndroidLibsOfflineTrialsProperties> {
    private final wlf<l0e> a;

    public g9(wlf<l0e> wlf) {
        this.a = wlf;
    }

    public static AndroidLibsOfflineTrialsProperties a(l0e l0e) {
        AndroidLibsOfflineTrialsProperties androidLibsOfflineTrialsProperties = (AndroidLibsOfflineTrialsProperties) l0e.a(h4.a);
        yif.g(androidLibsOfflineTrialsProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidLibsOfflineTrialsProperties;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
