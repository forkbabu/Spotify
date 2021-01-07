package com.spotify.remoteconfig;

public final class wb implements fjf<AndroidLibsYourLibraryXFlagsProperties> {
    private final wlf<l0e> a;

    public wb(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidLibsYourLibraryXFlagsProperties androidLibsYourLibraryXFlagsProperties = (AndroidLibsYourLibraryXFlagsProperties) this.a.get().a(q4.a);
        yif.g(androidLibsYourLibraryXFlagsProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidLibsYourLibraryXFlagsProperties;
    }
}
