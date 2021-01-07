package com.spotify.remoteconfig;

public final class pb implements fjf<AndroidLibsVoiceProperties> {
    private final wlf<l0e> a;

    public pb(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidLibsVoiceProperties androidLibsVoiceProperties = (AndroidLibsVoiceProperties) this.a.get().a(x1.a);
        yif.g(androidLibsVoiceProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidLibsVoiceProperties;
    }
}
