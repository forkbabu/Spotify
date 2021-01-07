package com.spotify.music.features.album.di;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.album.api.header.AlbumHeader;
import com.spotify.encore.consumer.components.album.entrypoint.EncoreConsumerExtensions;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class a0 implements fjf<Component<AlbumHeader.Model, AlbumHeader.Events>> {
    private final wlf<EncoreConsumerEntryPoint> a;

    public a0(wlf<EncoreConsumerEntryPoint> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Component<AlbumHeader.Model, AlbumHeader.Events> make = EncoreConsumerExtensions.albumHeaderFactory(this.a.get().getHeaders()).make();
        yif.g(make, "Cannot return null from a non-@Nullable @Provides method");
        return make;
    }
}
