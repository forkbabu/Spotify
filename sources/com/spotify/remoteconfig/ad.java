package com.spotify.remoteconfig;

public final class ad implements fjf<AppsMusicLibsRemoteconfigProperties> {
    private final wlf<l0e> a;

    public ad(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AppsMusicLibsRemoteconfigProperties appsMusicLibsRemoteconfigProperties = (AppsMusicLibsRemoteconfigProperties) this.a.get().a(e4.a);
        yif.g(appsMusicLibsRemoteconfigProperties, "Cannot return null from a non-@Nullable @Provides method");
        return appsMusicLibsRemoteconfigProperties;
    }
}
