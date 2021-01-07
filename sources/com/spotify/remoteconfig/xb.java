package com.spotify.remoteconfig;

public final class xb implements fjf<AndroidMediaBrowserServiceProperties> {
    private final wlf<l0e> a;

    public xb(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidMediaBrowserServiceProperties androidMediaBrowserServiceProperties = (AndroidMediaBrowserServiceProperties) this.a.get().a(q2.a);
        yif.g(androidMediaBrowserServiceProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidMediaBrowserServiceProperties;
    }
}
