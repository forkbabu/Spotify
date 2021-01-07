package com.spotify.remoteconfig;

public final class ub implements fjf<AndroidLibsYourLibraryFlagsProperties> {
    private final wlf<l0e> a;

    public ub(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidLibsYourLibraryFlagsProperties androidLibsYourLibraryFlagsProperties = (AndroidLibsYourLibraryFlagsProperties) this.a.get().a(h.a);
        yif.g(androidLibsYourLibraryFlagsProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidLibsYourLibraryFlagsProperties;
    }
}
