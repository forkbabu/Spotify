package com.spotify.music.features.album.encore;

import androidx.lifecycle.n;
import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.album.api.header.AlbumHeader;
import io.reactivex.y;

public final class a implements fjf<AlbumHeaderComponentBinder> {
    private final wlf<String> a;
    private final wlf<Boolean> b;
    private final wlf<n> c;
    private final wlf<Component<AlbumHeader.Model, AlbumHeader.Events>> d;
    private final wlf<i> e;
    private final wlf<y> f;
    private final wlf<ly3> g;

    public a(wlf<String> wlf, wlf<Boolean> wlf2, wlf<n> wlf3, wlf<Component<AlbumHeader.Model, AlbumHeader.Events>> wlf4, wlf<i> wlf5, wlf<y> wlf6, wlf<ly3> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AlbumHeaderComponentBinder(this.a.get(), this.b.get().booleanValue(), this.c.get(), this.d, this.e.get(), this.f.get(), this.g.get());
    }
}
