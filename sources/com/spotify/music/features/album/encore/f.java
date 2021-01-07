package com.spotify.music.features.album.encore;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class f implements fjf<AlbumHeaderTransformer> {
    private final wlf<String> a;
    private final wlf<Boolean> b;
    private final wlf<String> c;
    private final wlf<g<PlayerState>> d;
    private final wlf<CollectionStateProvider> e;

    public f(wlf<String> wlf, wlf<Boolean> wlf2, wlf<String> wlf3, wlf<g<PlayerState>> wlf4, wlf<CollectionStateProvider> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AlbumHeaderTransformer(this.a.get(), this.b.get().booleanValue(), this.c.get(), this.d.get(), this.e.get());
    }
}
