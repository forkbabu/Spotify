package com.spotify.music.features.album.di;

import androidx.lifecycle.n;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class l implements fjf<AlbumAutoPlayUrlHandler> {
    private final wlf<g<PlayerState>> a;
    private final wlf<String> b;
    private final wlf<String> c;
    private final wlf<o61> d;
    private final wlf<n> e;

    public l(wlf<g<PlayerState>> wlf, wlf<String> wlf2, wlf<String> wlf3, wlf<o61> wlf4, wlf<n> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AlbumAutoPlayUrlHandler(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
