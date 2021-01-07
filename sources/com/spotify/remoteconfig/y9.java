package com.spotify.remoteconfig;

public final class y9 implements fjf<AndroidLibsPlaylistEntityModesVanillaProperties> {
    private final wlf<l0e> a;

    public y9(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidLibsPlaylistEntityModesVanillaProperties androidLibsPlaylistEntityModesVanillaProperties = (AndroidLibsPlaylistEntityModesVanillaProperties) this.a.get().a(z1.a);
        yif.g(androidLibsPlaylistEntityModesVanillaProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidLibsPlaylistEntityModesVanillaProperties;
    }
}
