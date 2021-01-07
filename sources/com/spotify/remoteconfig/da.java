package com.spotify.remoteconfig;

public final class da implements fjf<AndroidLibsPodcastInteractivityProperties> {
    private final wlf<l0e> a;

    public da(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidLibsPodcastInteractivityProperties androidLibsPodcastInteractivityProperties = (AndroidLibsPodcastInteractivityProperties) this.a.get().a(w1.a);
        yif.g(androidLibsPodcastInteractivityProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidLibsPodcastInteractivityProperties;
    }
}
