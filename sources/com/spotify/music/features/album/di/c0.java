package com.spotify.music.features.album.di;

import com.spotify.music.features.album.AlbumFragment;
import com.spotify.music.features.album.a;

public final class c0 implements fjf<hf3> {
    private final wlf<AlbumFragment> a;

    public c0(wlf<AlbumFragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AlbumFragment albumFragment = this.a.get();
        albumFragment.getClass();
        return new a(albumFragment);
    }
}
