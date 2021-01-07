package com.spotify.music.features.album.di;

import com.spotify.music.features.album.AlbumFragment;

public final class i0 implements fjf<Boolean> {
    private final wlf<AlbumFragment> a;

    public i0(wlf<AlbumFragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().k4().getBoolean("is_autoplay_uri"));
    }
}
