package com.spotify.remoteconfig;

public final class n9 implements fjf<AndroidLibsPlaylistEntityConfigurationProperties> {
    private final wlf<l0e> a;

    public n9(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties = (AndroidLibsPlaylistEntityConfigurationProperties) this.a.get().a(b.a);
        yif.g(androidLibsPlaylistEntityConfigurationProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidLibsPlaylistEntityConfigurationProperties;
    }
}
