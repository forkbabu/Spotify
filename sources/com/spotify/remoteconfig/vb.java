package com.spotify.remoteconfig;

public final class vb implements fjf<AndroidLibsYourLibraryMusicPagesFlagsProperties> {
    private final wlf<l0e> a;

    public vb(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidLibsYourLibraryMusicPagesFlagsProperties androidLibsYourLibraryMusicPagesFlagsProperties = (AndroidLibsYourLibraryMusicPagesFlagsProperties) this.a.get().a(n0.a);
        yif.g(androidLibsYourLibraryMusicPagesFlagsProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidLibsYourLibraryMusicPagesFlagsProperties;
    }
}
