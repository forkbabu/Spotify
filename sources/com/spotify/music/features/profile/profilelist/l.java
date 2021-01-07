package com.spotify.music.features.profile.profilelist;

public final class l implements fjf<ProfileListMetadataResolver> {
    private final wlf<dt7> a;

    public l(wlf<dt7> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ProfileListMetadataResolver(this.a.get());
    }
}
