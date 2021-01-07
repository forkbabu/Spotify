package com.spotify.music.features.album.di;

import com.spotify.music.features.album.AlbumFragment;

public final class n implements fjf<String> {
    private final wlf<AlbumFragment> a;

    public n(wlf<AlbumFragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String string = this.a.get().k4().getString("album_view_uri");
        yif.g(string, "Cannot return null from a non-@Nullable @Provides method");
        return string;
    }
}
