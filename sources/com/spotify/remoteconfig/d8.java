package com.spotify.remoteconfig;

public final class d8 implements fjf<AndroidLibsContextMenuPlaylistProperties> {
    private final wlf<l0e> a;

    public d8(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidLibsContextMenuPlaylistProperties androidLibsContextMenuPlaylistProperties = (AndroidLibsContextMenuPlaylistProperties) this.a.get().a(u2.a);
        yif.g(androidLibsContextMenuPlaylistProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidLibsContextMenuPlaylistProperties;
    }
}
