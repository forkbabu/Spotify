package com.spotify.remoteconfig;

public final class jc implements fjf<AndroidMusicLibsNowplayingScrollProperties> {
    private final wlf<l0e> a;

    public jc(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidMusicLibsNowplayingScrollProperties androidMusicLibsNowplayingScrollProperties = (AndroidMusicLibsNowplayingScrollProperties) this.a.get().a(z2.a);
        yif.g(androidMusicLibsNowplayingScrollProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidMusicLibsNowplayingScrollProperties;
    }
}
