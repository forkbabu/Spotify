package com.spotify.remoteconfig;

public final class tb implements fjf<AndroidLibsYourEpisodesFlagsProperties> {
    private final wlf<l0e> a;

    public tb(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidLibsYourEpisodesFlagsProperties androidLibsYourEpisodesFlagsProperties = (AndroidLibsYourEpisodesFlagsProperties) this.a.get().a(h3.a);
        yif.g(androidLibsYourEpisodesFlagsProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidLibsYourEpisodesFlagsProperties;
    }
}
